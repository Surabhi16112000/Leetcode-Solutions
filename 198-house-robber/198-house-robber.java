class Solution {
    public int rob(int[] nums) 
    {
        int incl=nums[0];
        int excl=0;
        
        for(int i=1;i<nums.length;i++)
        {
            int excl_new=Math.max(incl,excl);
            incl=excl;
            incl=incl+nums[i];
            excl=excl_new;
        }
        return Math.max(incl,excl);
    }
}