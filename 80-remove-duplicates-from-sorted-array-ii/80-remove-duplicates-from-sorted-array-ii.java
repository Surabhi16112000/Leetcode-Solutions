class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int n=nums.length;
        int p=0;
        for(int i=0;i<n;i++)
        {
            if(i<2)
            {
                nums[p++]=nums[i];
            }
            else if(nums[i]!=nums[p-2])
            {
                nums[p++]=nums[i];
            }
        }
        return p;
    }
}