class Solution {
    public int nthUglyNumber(int n) 
    {
        int[] dp=new int[n+1];
        dp[0]=1;
        int p1=0,p2=0,p3=0;
        
        for(int i=1;i<n;i++)
        {
            dp[i]=Math.min(dp[p1]*2, Math.min(dp[p2]*3,dp[p3]*5));
            if(dp[i]==dp[p1]*2) p1++;
            if(dp[i]==dp[p2]*3) p2++;
            if(dp[i]==dp[p3]*5) p3++;
        }
        return dp[n-1];
    }
}