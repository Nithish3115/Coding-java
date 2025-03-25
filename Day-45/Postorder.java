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
    private List<Integer> res = new ArrayList<>();

public List<Integer> postorderTraversal(TreeNode root) {
     tra(root);
    return res;
}
public void tra(TreeNode root){
    if(root == null){
        return;
    }
    
    tra(root.left);
    tra(root.right);
    res.add(root.val);
    
}
}