class Solution {
    public int[] countBits(int n) 
    {
        int[] ans=new int[n+1];
        ans[0]=0;
        if(n==0) return ans;
        
        for(int i=1;i<=n;i++)
        {
            ans[i]=ans[i/2]+(i%2);
        }
        return ans;
    }
}