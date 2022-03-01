class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) 
    {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        if(n==0) return ans;
        int[] count=new int[n];
        Arrays.fill(count,1);
        Arrays.sort(nums);
        
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]%nums[j]==0)
                {
                    count[i]=Math.max(count[i], count[j]+1);
                }
            }
        }
        
        int max_val_idx=0;
        for(int i=0;i<n;i++)
        {
            max_val_idx=count[i]>count[max_val_idx]? i : max_val_idx;
        }
        
        int currCount=count[max_val_idx];
        int t= nums[max_val_idx];
        for(int i=max_val_idx;i>=0;i--)
        {
            if(t% nums[i]==0 && currCount==count[i])
            {
                ans.add(nums[i]);
                t=nums[i];
                currCount--;
            }
        }
        return ans;
    }
}