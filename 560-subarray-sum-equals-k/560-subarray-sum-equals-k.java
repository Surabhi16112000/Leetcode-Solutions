class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int res=0;
        int preSum=0;
        for(int i=0;i<n;i++)
        {
            preSum+=nums[i];
            if(hm.containsKey(preSum-k))
            {
                res+=hm.get(preSum-k);
            }
            hm.put(preSum,hm.getOrDefault(preSum,0)+1);
        }
        return res;
    }
}