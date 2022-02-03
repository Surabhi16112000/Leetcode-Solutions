class Solution 
{
    public int minimumTotal(List<List<Integer>> tri) 
    {
        if(tri.size()==1) return tri.get(0).get(0);
        int size=tri.size();
        for(int i=1;i<size;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                {
                    tri.get(i).set(j, tri.get(i).get(j)+tri.get(i-1).get(j));
                }
                else if(j==i)
                {
                    tri.get(i).set(j, tri.get(i).get(j)+tri.get(i-1).get(j-1));
                }
                else
                {
                    tri.get(i).set(j, tri.get(i).get(j) + Math.min(tri.get(i-1).get(j), tri.get(i-1).get(j-1)));
                }
            }
        }
        int ans=Integer.MAX_VALUE;
        List<Integer> temp=tri.get(size-1);
       for(int j=0;j<size;j++)
          ans=ans>temp.get(j)?temp.get(j):ans;
        
        return ans;
    }
}