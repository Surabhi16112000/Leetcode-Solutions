class Solution 
{
    static int max;
    
    public int dfs(int r,int c,int[][] a)
    {
        int curr=0;
        if(r>=0 && r<a.length && c>=0 && c<a[0].length && a[r][c]==1) {
            a[r][c]=-1;
            curr+=dfs(r+1,c,a)+dfs(r-1,c,a)+dfs(r,c+1,a)+dfs(r,c-1,a);
            return curr+1;
        }
              
        return 0;
     }
    public int maxAreaOfIsland(int[][] a) 
    {
        max=0;
        
        int m=a.length;
        int n=a[0].length;
        
        
        boolean isIsland=false;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++) {
                if(a[i][j]==1)
                {
                    isIsland=true;
                    break;
                }
            }
        if(isIsland==false) return 0;
        for(int i=0;i<m;i++) 
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==1 )
                {
                    max=Math.max(max,dfs(i,j,a));
                }
            }
        }
        return max;
    }
}