class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) 
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int res=0;
        for(int a: nums1)
        {
            for(int b : nums2)
            {
                hm.put(a+b,hm.getOrDefault(a+b,0)+1);
            }
        }
        for(int c: nums3)
        {
            for(int d: nums4)
            {
                int sum=-c-d;
                res=res+hm.getOrDefault(sum,0);
            }
        }
        return res;
    }
}