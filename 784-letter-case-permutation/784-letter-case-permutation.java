class Solution {
    List<String> ans;
    HashSet<String> hs;
    public List<String> letterCasePermutation(String str) 
    {
        hs=new HashSet<String>();
        char[] s=str.toCharArray();
        
        
        solve(s,0,"");
        ans=new LinkedList<String>(hs);
        return ans;
    }
    void solve(char[] s, int ind,String output)
    {
        if(ind==s.length)
        {
            hs.add(output);
            
            return;
        }
        String op1=output;
        String op2=output;
        if(Character.isDigit(s[ind])==true)
        {
            op1=op1+""+s[ind];
            op2=op2+""+s[ind];
        }
        else
        {
            op1=op1+""+Character.toLowerCase(s[ind]);
            char ch=Character.toUpperCase(s[ind]);
            op2=op2+""+ch;
        }
        solve(s,ind+1,op1);
        solve(s,ind+1,op2);
        //return;
    }
}