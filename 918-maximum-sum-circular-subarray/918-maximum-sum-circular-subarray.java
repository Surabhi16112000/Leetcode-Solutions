class Solution {
    public int maxSubarraySumCircular(int[] nums) 
    {
        int n=nums.length;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int totalsum=0;
        int curr1=0;
        int curr2=0;
        for(int a: nums)
        {
            totalsum+=a;
            curr1+=a;
            maxsum=Math.max(curr1,maxsum);
            if(curr1<0)curr1=0;
            curr2+=a;
            minsum=Math.min(minsum,curr2);
            if(curr2>0)curr2=0;
        }
        if(maxsum<0) return maxsum;
        return Math.max(maxsum,totalsum-minsum);
    }
}