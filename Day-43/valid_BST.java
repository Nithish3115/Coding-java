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
    TreeNode p=null;
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        if(isValidBST(root.left) && (p==null|| p.val<root.val)){
            p=root;
            return (isValidBST(root.right));
        }
        return false;
        
    }
}