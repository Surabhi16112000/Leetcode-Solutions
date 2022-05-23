class Solution {
    int[][][] dp=null;
    public int findMaxForm(String[] s, int m, int n) 
    {
        dp=new int[m+1][n+1][s.length];
        int[][] freq=new int[s.length][2];
        for(int i=0;i<s.length;i++)
        {
            String temp=s[i];
            for(char c: temp.toCharArray())
            {
                if(c=='1')
                    freq[i][1]++;
                else
                    freq[i][0]++;
            }
        }
        
        return helper(freq,m,n,0,s.length);
        
    }
    
    int helper(int[][] freq, int m, int n, int ind, int end)
    {
        if(ind>=end || (m+n)<=0) return 0;
        if(dp[m][n][ind]!=0) return dp[m][n][ind];
        int numZero=freq[ind][0];
        int numOne=freq[ind][1];
        
        int inc=0, exc=0;
        if(numZero<=m && numOne<=n)
        {
            inc=1+helper(freq,m-numZero,n-numOne,ind+1,end);
        }
        exc=helper(freq,m,n,ind+1,end);
        
        return dp[m][n][ind]=Math.max(inc,exc);
    }
}