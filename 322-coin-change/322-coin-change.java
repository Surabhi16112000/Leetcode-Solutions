class Solution {
    public int coinChange(int[] a, int amt) 
    {
        int n=a.length;
        int[][] dp= new int[n+1][amt+1];
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=0;
        }
        for(int i=0;i<=amt;i++)
        {
            dp[0][i]=Integer.MAX_VALUE-1;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=amt;j++)
            {
                if(a[i-1]<=j)
                {
                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-a[i-1]]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][amt]==Integer.MAX_VALUE-1?-1:dp[n][amt];
    }
}