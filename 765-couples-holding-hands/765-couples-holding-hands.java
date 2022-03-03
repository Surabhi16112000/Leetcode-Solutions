class Solution {
    HashMap<Integer,Integer> hm;
    public int minSwapsCouples(int[] a) 
    {
        int n=a.length;
        hm=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            hm.put(a[i],i);
        }
        int swaps=0;
        for(int i=0;i<n;i+=2)
        {
            int first=a[i];
            int second=first ^ 1;
            
            if(a[i+1]!=second)
            {
                swap(a, i+1,hm.get(second));
                swaps++;
            }
            
        }
        return swaps;
    }
    
    void swap(int[] a, int x, int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
        
        hm.put(a[x],x);
        hm.put(a[y],y);
    }
}