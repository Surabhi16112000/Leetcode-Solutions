class Solution 
{
    public int minimumTotal(List<List<Integer>> tri) 
    {
        if(tri.size()==1) return tri.get(0).get(0);
        int size=tri.size();
        int[] front=new int[size];
        int[] curr=new int[size];
        for(int j=0;j<size;j++)
        {
            front[j]=tri.get(size-1).get(j);
        }
        for(int i=size-2;i>=0;i--)
        {
            curr=new int[size];
            for(int j=i;j>=0;j--)
            {
                int d=tri.get(i).get(j) + front[j];
                int diag=tri.get(i).get(j) + front[j+1];
                curr[j]=Math.min(d,diag);
            }
            front=curr;
        }
        return front[0];
    }
}