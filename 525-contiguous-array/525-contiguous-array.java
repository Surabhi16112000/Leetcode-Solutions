class Solution {
    public int findMaxLength(int[] a) 
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0){
                a[i]=-1;
            }
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int maxlen=0;
        int sum=0;
        
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
            if(hm.containsKey(sum))
            {
                maxlen=Math.max(maxlen,i-hm.get(sum));
            }
            else
            hm.put(sum,i);
        }
        return maxlen;
    }
}