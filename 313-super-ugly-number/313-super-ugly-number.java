class Solution {
    public int nthSuperUglyNumber(int n, int[] a) 
    {
        int len=a.length;
        int[] p=new int[len];
        int[] dp=new int[n+1];
        Arrays.fill(p,0);
        dp[0]=1;
        
        for(int i=1;i<=n;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<len;j++)
            {
                int temp=a[j]*dp[p[j]];
                if(temp<min)
                {
                    min=temp;
                }
            }
            for(int j=0;j<len;j++)
            {
                if(a[j]*dp[p[j]]==min)
                {
                    ++p[j];
                }
            }
            dp[i]=min;
        }
        return dp[n-1];
    }
}