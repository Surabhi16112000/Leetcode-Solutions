class Solution {
    public int getMaxLen(int[] nums) 
    {
        int max=1;
        int first_neg=-1;
        int zeroInd=-1;
        int max_len=0;
        int neg_num_cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                if(first_neg==-1) first_neg=i;
                neg_num_cnt++;
                
            }
            if(nums[i]==0)
            {
                first_neg=-1;
                neg_num_cnt=0;
                zeroInd=i;
            }
            else
            {
                if(neg_num_cnt%2==0)
                {
                    max_len=Math.max(i-zeroInd,max_len);
                }
                else
                {
                    max_len=Math.max(i-first_neg,max_len);
                }
            }
        }
        return max_len;
    }
}