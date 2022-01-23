class Solution {
    public int rob(int[] nums) 
    {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        return Math.max(solve(0,n-2,nums),solve(1,n-1,nums));
    }
    public int solve(int l, int h, int[] nums)
    {
        int incl=nums[l];
        int excl=0;
        
        for(int i=l+1;i<=h;i++)
        {
            int excl_new=Math.max(incl,excl);
            incl=excl;
            incl=incl+nums[i];
            excl=excl_new;
        }
        return Math.max(incl,excl);
    }
}