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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<>();
        if(root == null){
            return result;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize =queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curentNode =queue.poll();
                
                if(curentNode.left!=null){
                    queue.offer(curentNode.left);
                }
                if(curentNode.right!=null){
                    queue.offer(curentNode.right);
                }
                if(i==levelSize-1){
                    result.add(curentNode.val);
                }
            }
        }
        return result;
    }
}
