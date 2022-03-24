class Solution {
    public int numRescueBoats(int[] p, int L) 
    {
        Arrays.sort(p);
        int c=0;
        int l=0, h=p.length-1;
        while(l<=h)
        {
            if(p[l]+p[h]<=L)
            {
                l++; h--;
            }
            else
            {
                h--;
            }
            c++;
        }
        return c;
    }
}

//1,2,4,5 L=6