class Solution {
    public void moveZeroes(int[] a) 
    {
        int n = a.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[c]=a[i]; c++;
            }
            
        }
        while(c<n)
        {
            a[c++]=0;
        }
        
    }
}