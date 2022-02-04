class Solution {
    public int uniquePathsWithObstacles(int[][] a) 
    {
        int m=a.length; 
        int n=a[0].length;
        int[][] dp=new int[m][n];
        if(a[0][0]==1) return 0;
        else dp[0][0]=1;
        for(int i=1;i<m;i++)
        {
            dp[i][0]=(dp[i-1][0]==1 && a[i][0]==0)?1:0;
        }
        for(int j=1;j<n;j++)
        {
            dp[0][j]=(dp[0][j-1]==1 && a[0][j]==0)?1:0;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(a[i][j]==1) dp[i][j]=0;
                else
                    
                    {
                        dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }
                    
                    
                
            }
        }
        return dp[m-1][n-1];
    }
}