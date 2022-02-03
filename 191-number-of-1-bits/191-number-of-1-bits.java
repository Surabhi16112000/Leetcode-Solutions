public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int num) 
    {
        int count=0;
        while(num!=0)
        {
            count+=(num & 1);
            num=num>>>1;
        }
         
        
        return count;
    }
}