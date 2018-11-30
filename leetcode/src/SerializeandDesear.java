import java.util.*;

public class SerializeandDesear {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node != null){
                    sb.append("null,");
                }else{
                    sb.append(node.val + ",");
                }
                if(node != null){
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        String[] array = data.split(",");
        int val = Integer.parseInt(array[0]);
        TreeNode root = new TreeNode(val);
        int index = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            for(int i = 0; i < queue.size(); i++){
                TreeNode node = queue.poll();
                if(array[index].equals("null")){
                    node.left = null;
                }else{
                    node.left = new TreeNode(Integer.parseInt(array[index]));
                    queue.offer(node.left );
                }
                index++;
                if(array[index].equals("null")){
                    node.right = null;
                }else{
                    node.right = new TreeNode(Integer.parseInt(array[index]));
                    queue.offer(node.right);
                }
                index++;
            }
        }
        return root;
    }
    public static void main(String[] args){
        deserialize("1,2,3,null,null,4,5");
    }
}
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}