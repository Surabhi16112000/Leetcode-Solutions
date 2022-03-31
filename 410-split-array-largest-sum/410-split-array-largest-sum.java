class Solution {
    public int max(int[] a)
    {
        int max_num=a[0];
        for(int i:a)
        {
            max_num=i>max_num?i:max_num;
        }
        return max_num;
    }
    public int splitArray(int[] nums, int tar) 
    {
        int n=nums.length;
        return bin_Search(nums,n,tar);
    }
    public boolean isAns(int[] a, int l, int ans,int tar)
    {
        int sum=0; int c=1;
        for(int i=0;i<l;i++)
        {
            if(sum+a[i]<=ans)
            {
                sum+=a[i];
            }
            else
            {
                sum=a[i]; c++;
                if(c>tar) return false;
            }
        }
        return true;
    }
    public int bin_Search(int[] a, int l, int tar)
    {
        int sum=0;
        for(int i:a) sum+=i;
        int low=max(a), high=sum;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(isAns(a,l,mid,tar))
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return high;
    }
}