

public class IterativeBST {
    public static int find(TreeNode root, int target){

        while(root != null && root.val != target){
            System.out.println(root.val);
            if(root.val > target){
                root = root.left;

            }else{
                root = root.right;
            }
        }
        if(root == null){
            return -1;
        }else{
            return root.val;
        }

    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        root.left = node1;
        root.right = node3;
        node3.left = node2;
        System.out.println(find(root, 3));
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
