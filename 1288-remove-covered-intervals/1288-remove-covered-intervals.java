class Solution {
    public int removeCoveredIntervals(int[][] a) 
    {
        Arrays.sort(a,new Comparator<int[]>()
        {
            public int compare(int[] a1,int[] a2)
            {
                if(a1[0]!=a2[0])
                    return a1[0]-a2[0];
                return a2[1]-a1[1];
            }
        });
        int ans=0;
        int max=0;
        for(int[] ele:a)
        {
            if(ele[1]>max)
            {
                max=ele[1];
                ans++;
            }
        }
        return ans;
    }
}