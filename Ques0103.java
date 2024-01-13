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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> reuslt = new ArrayList<>();
            if(root==null){
                return reuslt;
            }
            Deque<TreeNode> queue =new LinkedList<>();
            queue.offer(root);
            boolean reverse =false;
            while(!queue.isEmpty()){
                int levelSize = queue.size();
                ArrayList<Integer> cLevel =new ArrayList<>();
                for (int i = 0; i < levelSize; i++) {
                    if(!reverse){
                        TreeNode cNode =queue.pollFirst();
                        cLevel.add(cNode.val);
                        if(cNode.left!=null){
                            queue.addLast(cNode.left);
                        }
                        if(cNode.right!=null){
                            queue.addLast(cNode.right);
                        }
                    }else{
                        TreeNode cNode =queue.pollLast();
                        cLevel.add(cNode.val);
                        
                        if(cNode.right!=null){
                            queue.addFirst(cNode.right);
                        }
                        if(cNode.left!=null){
                            queue.addFirst(cNode.left);
                        }
                    }
                    
                }
                reverse = !reverse;
                reuslt.add(cLevel);
            }
            return reuslt;
    }
}
