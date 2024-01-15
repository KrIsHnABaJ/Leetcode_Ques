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
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        return help(root, k).val;
    }
    public TreeNode help(TreeNode root, int k) {
        if(root==null){
            return null;
        }
        TreeNode left =help(root.left, k);
        if(left!=null){
            return left;
        }
        count++;
        if(count==k){
            return root;
        }
        return help(root.right, k);
    }
}
