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
    List<Integer> l1,l2;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) 
    {
        List<Integer> ans=new LinkedList<>();
        l1=new ArrayList<Integer>();
        l2=new ArrayList<Integer>();
        inorder1(root1);
        inorder2(root2);
        int m=l1.size();
        int n=l2.size();
        int i=0, j=0;
        while(i<m && j<n)
        {
            if(l1.get(i)<l2.get(j))
            {
                ans.add(l1.get(i++));
            }
            else
            {
                ans.add(l2.get(j++));
            }
        }
        while(i<m)
        {
            ans.add(l1.get(i++));
        }
        while(j<n)
        {
            ans.add(l2.get(j++));
        }
        return ans;
    }
    
    void inorder1(TreeNode root)
    {
        if(root==null) return;
        inorder1(root.left);
        if(root!=null)l1.add(root.val);
        inorder1(root.right);
    }
    void inorder2(TreeNode root)
    {
        if(root==null) return;
        inorder2(root.left);
        if(root!=null)l2.add(root.val);
        inorder2(root.right);
    }
    
}