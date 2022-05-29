class Solution {
    public int maxProduct(String[] a) 
    {
        int n=a.length;
        int[] val=new int[n];
        for(int i=0;i<n;i++)
        {
            String temp=a[i];
            val[i]=0;
            for(int j=0;j<temp.length();j++)
            {
                val[i]= val[i] | 1<<temp.charAt(j)-'a';
            }
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((val[i] & val[j]) ==0 && a[i].length()*a[j].length()>max)
                {
                    max=a[i].length()*a[j].length();
                }
            }
        }
        return max;
    }
}