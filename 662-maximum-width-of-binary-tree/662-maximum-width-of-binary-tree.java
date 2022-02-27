
class Solution {
    class MyNode {
        TreeNode node;
        int idx;
        MyNode(TreeNode node, int idx){
            this.node = node;
            this.idx = idx;
        }
        
    }
    public int widthOfBinaryTree(TreeNode root) 
    {
        int ans=0;
        if(root.left==null && root.right==null) return 1;
        Queue<MyNode> q=new LinkedList<>();
        q.add(new MyNode(root,0));
        int start=0, end=0;
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int i=0;i<s;i++) 
            {
                MyNode temp=q.remove();
                if(i==0){
                    start=temp.idx;
                }
                if(i==s-1)
                {
                    end=temp.idx;
                }
                if(temp.node.left!=null)
                    q.add(new MyNode(temp.node.left,2*temp.idx+1));
                if(temp.node.right!=null)
                    q.add(new MyNode(temp.node.right,2*temp.idx+2));
                
            }
            ans=ans<end-start+1?end-start+1:ans;
        }
        return ans;
    }
}