class Solution {
    Boolean[] dp=new Boolean[100000+1];
    public boolean winnerSquareGame(int n) 
    {
        if(dp[n]!=null) return dp[n];
        
        dp[0]=true;
        dp[1]=true;
        boolean ans=false;
        for(int i=1 ; n-i*i>=0 ; i++)
        {
            if(n-i*i==0)
            {
                ans=true;
                break;
            }
            else{
                ans=ans | !winnerSquareGame(n-i*i);
            }
        }
        return dp[n]=ans;
    }
}