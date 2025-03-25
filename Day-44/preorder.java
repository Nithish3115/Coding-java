class Solution {
    private List<Integer> res = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        tra(root);
        return res;
    }
    public void tra(TreeNode root){
        if(root == null){
            return;
        }
        res.add(root.val);
        tra(root.left);
        tra(root.right);
        
    }
}