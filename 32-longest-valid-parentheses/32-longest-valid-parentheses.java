class Solution {
    public int longestValidParentheses(String str)
    {
        int l=str.length();
        Stack<Integer> s=new Stack<>();
        s.push(-1);
        for(int i=0;i<l;i++)
        {
            if(str.charAt(i)=='(')
                s.push(i);
            else
            {
                if(s.size()>1)
                {
                    if(str.charAt(s.peek())=='(')
                        s.pop();
                    else
                        s.push(i);
                }
                else
                {
                    s.push(i);
                }
            }
        }
        s.push(l);
        int max=0;
        while(!s.isEmpty())
        {
            int top=s.pop();
            if(!s.isEmpty())
            {
                max=Math.max(max, top-s.peek()-1);
            }
        }
        return max;
    }
}