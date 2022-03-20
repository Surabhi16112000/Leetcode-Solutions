class Solution {
    public int minDominoRotations(int[] t, int[] b) 
    {
        int n=t.length;
        int num1=t[0];
        int num2=b[0];
        int max=Integer.MAX_VALUE;
        
        int c1=0, c2=0,c3=0,c4=0;
        for(int i=0;i<n;i++)
        {
            if(c1!=max)
            {
                if(t[i]==num1){
                    //nothing to do
                }
                else if(b[i]==num1)
                    c1++;
                else
                    c1=max;
            }
            if(c2!=max)
            {
                if(b[i]==num1){
                    //nothing to do
                }
                else if(t[i]==num1)
                    c2++;
                else
                    c2=max;
            }
            if(c3!=max)
            {
                if(t[i]==num2){
                    //nothing to do
                }
                else if(b[i]==num2)
                    c3++;
                else
                    c3=max;
            }
            if(c4!=max)
            {
                if(b[i]==num2){
                    //nothing to do
                }
                else if(t[i]==num2)
                    c4++;
                else
                    c4=max;
            }
        }
        int res=Math.min(Math.min(c1,c2),Math.min(c3,c4));
        return res==max ? -1 : res;
    }
}