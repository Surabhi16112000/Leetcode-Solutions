class Solution {
    public int largestRectangleArea(int[] a) 
    {
        int n=a.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=-1;
        right[n-1]=n;
        Stack<Integer> s=new Stack<>();
        s.push(0);
        for(int i=1;i<n;i++)
        {
            while(!s.isEmpty() && a[s.peek()]>=a[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                left[i]=-1;
            }
            else{
                left[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && a[s.peek()]>=a[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                right[i]=n;
            }
            else
            {
                right[i]=s.peek();
            }
            s.push(i);
        }
        int area=0;
        for(int i=0;i<n;i++)
        {
            int temp=a[i]*(right[i]-left[i]-1);
            area=temp>area?temp:area;
        }
        return area;
    }
    
   
}