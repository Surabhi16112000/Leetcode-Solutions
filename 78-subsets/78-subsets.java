class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        int n=nums.length;
        int x=(1<<n);
        //System.out.print("x="+""+x);
        for(int i=0;i<x;i++)
        {
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if(((i>>j)&1) == 1)
                {
                    temp.add(nums[j]);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}