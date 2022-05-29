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
    static TreeNode prev;
    public boolean isValidBST(TreeNode root) 
    {
        prev=null;
        if(root==null || (root.left==null && root.right==null)) return true;
        return solve(root);
        
    }
    public boolean solve(TreeNode curr)
    {
        if(curr==null) return true;
        if(solve(curr.left)==false) return false;
        
        if(prev!=null && curr.val <=prev.val) return false;
        
        prev=curr;
        return solve(curr.right);
    }
}