class Solution {
    public boolean checkSubarraySum(int[] nums, int k) 
    {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int currSum=0;
        for(int i=0;i<n;i++)
        {
            currSum+=nums[i];
            if(hm.containsKey(currSum%k))
            {
                int prev=hm.get(currSum%k);
                if(i-prev>1) return true;
            }
            else
            {
                hm.put(currSum%k,i);
            }
        }
        return false;
    }
}