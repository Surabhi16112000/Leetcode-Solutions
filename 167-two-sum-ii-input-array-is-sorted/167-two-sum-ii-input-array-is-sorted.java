class Solution {
    public int[] twoSum(int[] a, int t) 
    {
        int h=a.length-1;
        int l=0;
        int[] ans=new int[2];
        while(l<h)
        {
            int sum=a[l]+a[h];
            if(sum==t)
            {
                ans[0]=l+1;
                ans[1]=h+1;
                return ans;
            }
            if(sum<t)
            {
                l++;
            }
            else
            {
                h--;
            }
            
        }
        return ans;
    }
}