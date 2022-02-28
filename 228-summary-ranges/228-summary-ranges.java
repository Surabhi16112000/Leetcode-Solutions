class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
        List<String> ans=new LinkedList<>();
        int s=0,e=0;
        int l=nums.length;
        int i=0;
        while(i<l)
        {
            while(i<l-1 && nums[i]+1 == nums[i+1])
            {
                i++;
                e++;
            }
            if(s==e)
            {
                ans.add(nums[s]+"");
            }
            else
            {
                ans.add(nums[s]+"->"+nums[e]);
            }
            e++;
            s=e;
            i++;
        }
        return ans;
    }
}