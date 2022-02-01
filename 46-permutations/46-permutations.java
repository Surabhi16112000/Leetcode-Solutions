class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        ArrayList<List<Integer>> ans=new ArrayList<List<Integer>>();
        solve(0,nums,ans);
        return ans;
    }
    public void solve(int index, int[] nums, ArrayList<List<Integer>> ans)
    {
        if(index==nums.length)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i: nums)
            {
                temp.add(i);
            }
            ans.add(temp);
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            int temp=nums[i]; nums[i]=nums[index]; nums[index]=temp;
            solve(index+1,nums,ans);
            temp=nums[i]; nums[i]=nums[index]; nums[index]=temp;
        }
        return;
    }
}