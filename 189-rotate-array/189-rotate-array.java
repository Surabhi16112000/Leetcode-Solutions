class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        k=k%n;
        int l=0; int h=n-1;
        while(l<h)
        {
            int temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
             l++; h--;
        }
        int p=k-1;
        l=0;h=p;
        while(l<h)
        {
            int temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
            l++; h--;
        }
        l=p+1; h=n-1;
        while(l<h)
        {
            int temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
            l++; h--;
        }
        return;
    }
}