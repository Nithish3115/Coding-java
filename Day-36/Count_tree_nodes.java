class Solution {
    public int countNodes(TreeNode root) {
        if (root == null){
            return 0;
        }
        int stark = countNodes(root.left);
        int lannister = countNodes(root.right);  
    return  1+stark+lannister;
    }
}