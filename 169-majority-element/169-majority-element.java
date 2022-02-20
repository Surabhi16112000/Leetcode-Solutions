class Solution {
    public int majorityElement(int[] nums) 
    {
        int n=nums.length;
        int ans=nums[0], count=1;
        for(int i=1;i<n;i++)
        {
            if(count==0)
            {
                ans=nums[i];
            }
            if(ans==nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return ans;
    }
}