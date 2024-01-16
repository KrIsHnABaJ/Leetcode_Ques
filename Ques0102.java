/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> reuslt = new ArrayList<>();
        if(root==null){
            return reuslt;
        }
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            ArrayList<Integer> cLevel =new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                
                TreeNode cNode =queue.poll();
                cLevel.add(cNode.val);
                if(cNode.left!=null){
                    queue.offer(cNode.left);
                }
                if(cNode.right!=null){
                    queue.offer(cNode.right);
                }
            }
            reuslt.add(cLevel);
        }
        return reuslt;
    }
}
