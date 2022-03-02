class Solution {
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer>hs=new HashSet<Integer>();
        for(int n:nums)
        {
            hs.add(n);
        }
        int len=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!hs.contains(nums[i]-1))
            {
                int c=1;
                int next=nums[i]+1;
                while(hs.contains(next))
                {
                    c++;
                    next++;
                }
                len=Math.max(len,c);
            }
        }
        return len;
    }
}