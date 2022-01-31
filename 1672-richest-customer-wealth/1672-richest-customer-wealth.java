class Solution {
    public int maximumWealth(int[][] a) 
    {
        int m=a.length;
        int n=a[0].length;
        
        int max_profit=0;
        for(int i=0;i<m;i++)
        {
            int curr=0;
            for(int j=0;j<n;j++)
            {
                curr+=a[i][j];
            }
            if(curr>max_profit) max_profit=curr;
        }
        return max_profit;
    }
}