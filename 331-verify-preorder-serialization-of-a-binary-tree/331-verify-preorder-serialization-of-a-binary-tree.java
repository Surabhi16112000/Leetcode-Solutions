class Solution {
    public boolean isValidSerialization(String preorder) 
    {
        int l=preorder.length();
        int vacancy=1;
        String[] nodes=new String[l];
        nodes=preorder.split(",");
        for(String s: nodes)
        {
            vacancy--;
            if(vacancy<0) return false;
            
            if(!s.equals("#"))
                vacancy+=2;
        }
        return vacancy==0;
    }
}