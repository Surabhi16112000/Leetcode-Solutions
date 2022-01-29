class Solution {
    public boolean wordBreak(String s, List<String> dict) 
    {
        
        int l=s.length();
        if(l==0) return true;
        int[] dp=new int[l+1];
        dp[l]=1;
        
        for(int i=l-1;i>=0;i--)
        {
            for(int j=i;j<l;j++)
            {
                if(dict.contains(s.substring(i,j+1)) && dp[j+1]==1)
                {
                    dp[i]=1;
                    break;
                }
            }
            
        }
        return dp[0]==1?true:false;
    }
}