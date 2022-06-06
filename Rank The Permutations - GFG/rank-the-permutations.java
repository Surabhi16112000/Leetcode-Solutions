// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.rank(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static final int CHAR=256;
    static int fact(int n) 
    { 
    return (n <= 1) ? 1 : n * fact(n - 1); 
    } 
    
    static int rank(String str) 
    { 
    int res = 1; 
    int n=str.length();
    int mul= fact(n);
    int[] count=new int[CHAR];
    for(int i=0;i<n;i++){
        count[str.charAt(i)]++;
        if(count[str.charAt(i)]>1) return 0;
    }
    for(int i=1;i<CHAR;i++)
        count[i]+=count[i-1];
    for(int i=0;i<n-1;i++){
        mul=mul/(n-i);
        res=res+count[str.charAt(i)-1]*mul;
        for(int j=str.charAt(i);j<CHAR;j++)
            count[j]--;
    }
    return res%1000003; 
    } 
}