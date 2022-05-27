class Solution {
    public String multiply(String num1, String num2) 
    {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];
        int pf=0;
        
        for(int i = m - 1; i >= 0; i--) 
        {
            int ival=num1.charAt(i)-'0';
            int ind=pos.length-1-pf;
            pf++;
            int carry=0;
            int j=n-1;
            while(j>=0 || carry!=0)
            {
                int jval=0;
                if(j>=0)
                {
                    jval=num2.charAt(j)-'0';
                }
                int prod=ival * jval + carry + pos[ind];
                pos[ind]=prod%10;
                carry=prod/10;
                ind--;
                j--;
            }
        }  

        String ans="";
        boolean f=false;
        for(int p : pos) 
            if(f==false && p==0) continue;
            else 
            {
                f=true;
                ans+=""+p;
            }
        return ans;
    }
}