/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        StringBuffer buffer = new StringBuffer();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node  = queue.poll();
            if(node==null){
                buffer.append("null ");
                continue;
            }
            buffer.append(node.val+" ");
            queue.add(node.left);
            queue.add(node.right);
        }
        return buffer.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==""){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        String[] values =data.split(" ");
        TreeNode root =new TreeNode(Integer.parseInt(values[0]));
        queue.offer(root);
        for (int i = 1; i < values.length; i++) {
            TreeNode parent = queue.poll();
            if(!values[i].equals("null")){
                TreeNode left =new TreeNode(Integer.parseInt(values[i]));
                parent.left=left;
                queue.offer(left);
            }
            if(!values[++i].equals("null")){
                TreeNode right =new TreeNode(Integer.parseInt(values[i]));
                parent.right=right;
                queue.offer(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
