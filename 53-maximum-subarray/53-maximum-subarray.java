class Solution {
    public int maxSubArray(int[] nums) 
    {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i: nums)
        {
            sum=sum+i;
            if(i>sum) sum=i;
            if(sum>ans) ans=sum;
        }
        return ans;
    }
}