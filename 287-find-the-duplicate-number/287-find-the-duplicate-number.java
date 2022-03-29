class Solution {
    public int findDuplicate(int[] a) 
    {
        int n=a.length;
        int i=0;
        while(i<n)
        {
            int pos=Math.abs(a[i])-1;
            if(a[pos]>0)
                a[pos]=-a[pos];
            else
                return pos+1;
            i++;
        }
        return -1;
    }
}