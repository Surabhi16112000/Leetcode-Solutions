class Solution {
    public int compareVersion(String v1, String v2) 
    {
        
        
        String[] a=v1.split("\\.");
        String[] b=v2.split("\\.");
        int l1=a.length;
        int l2=b.length;
        int i=0,j=0;
        while(i<l1 && j<l2)
        {
            int num1=Integer.parseInt(a[i]);
            int num2=Integer.parseInt(b[j]);
            if(num1>num2)
                return 1;
            if(num1<num2)
                return -1;
            i++; j++;
        }
        while(i<l1)
        {
            int num1=Integer.parseInt(a[i]);
            i++;
            if(num1>0) return 1;
        }
        while(j<l2)
        {
            int num2=Integer.parseInt(b[j]);
            j++;
            if(num2>0) return -1;
        }
        return 0;
    }
}