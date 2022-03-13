class Solution {
    public int maxArea(int[] a) 
    {
        int r=a.length-1;
        int l=0;
        int ans=0;
        while(l<r)
        {
            int curr=Math.min(a[l],a[r])*(r-l);
            if(curr>ans) ans=curr;
            if(a[l]<a[r])l++;
            else r--;
            
        }
        return ans;
    }
}