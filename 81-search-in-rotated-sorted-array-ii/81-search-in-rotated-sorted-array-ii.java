class Solution {
    public boolean search(int[] a, int t) 
    {
        int n=a.length;
        int l=0,h=n-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(a[m]==t) return true;
            if(a[l]==a[m] && a[m]==a[h]) {
                l++; h--;
            }
            else if(a[l]<=a[m])
            {
                if(t>=a[l] && t<a[m])
                    h=m-1;
                else
                    l=m+1;
            }
            else 
            {
                if(t>a[m] && t<=a[h])
                    l=m+1;
                else
                    h=m-1;
            }
            
        }
        return false;
    }
}