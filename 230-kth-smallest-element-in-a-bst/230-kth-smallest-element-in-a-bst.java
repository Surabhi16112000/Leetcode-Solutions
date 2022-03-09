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
    public int kthSmallest(TreeNode root, int k) 
    {
        int[] num=new int[2];
        num[0]=0; num[1]=0;
        inorder(root,k,num);
        return num[1];
    }
    void inorder(TreeNode root, int k,int[] num)
    {
        if(root==null) return;
        
        inorder(root.left, k, num);
        
        if(++num[0] == k)
        {
            num[1]=root.val;
            return;
        }
        
        
        inorder(root.right,k,num);
    }
}