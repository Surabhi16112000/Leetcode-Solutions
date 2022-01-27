class Solution {
    public int maxProfit(int[] A) 
    {
        int ans=0; int l=A.length;
        int[] store=new int[l];
        store[l-1]=A[l-1];
        for(int i=l-2;i>=0;i--)
        {
            if(A[i]>store[i+1])
            {
                store[i]=A[i];
            }
            else
            {
                store[i]=store[i+1];
            }
        }
        for(int i=0;i<l;i++)
        {
            if(store[i]-A[i]>ans) ans=store[i]-A[i];
        }
        return ans;
    }
}