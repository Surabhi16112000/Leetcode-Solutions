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
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        TreeNode curr=root;
        while(!s.isEmpty() || curr!=null)
        {
            while(curr!=null)
            {
                s.push(curr);
                curr=curr.left;
            }
            if(!s.isEmpty())
            {
                ans.add(s.peek().val);
                curr=s.pop().right;
            }
        }
        return ans;
    }
}