class Solution {
    public boolean detectCapitalUse(String word) 
    {
        int l=word.length();
        boolean allCaps=true, allSmall=true, camelCase=true;
        for(int i=0;i<l;i++)
        {
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z')
            {
                allCaps=false;
                if(i==0) camelCase=false;
            }
            else if(ch>='A' && ch<='Z')
            {
                allSmall=false;
                if(i!=0) camelCase=false;
            }
        }
        return allCaps || allSmall || camelCase;
    }
}