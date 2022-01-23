class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int n=nums.length;
        int[] ans=new int[n];
        int l=0, h=n-1;
        int p=n-1;
        while(l<=h && p>=0)
        {
            int curr=0;
            if(Math.abs(nums[l]) > Math.abs(nums[h]))
            {
                curr= nums[l];
                ans[p]=curr*curr;
                p--; l++;
                
            }
            else
            {
                curr=nums[h];
                ans[p]=nums[h]*nums[h];
                p--; h--;
            }
             
        }
        return ans;
    }
}