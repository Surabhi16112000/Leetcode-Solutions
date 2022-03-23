class Solution {
    public int brokenCalc(int sv, int tar) 
    {
        if(sv>=tar)
            return sv-tar;
        if(tar%2==0)
            return 1+brokenCalc(sv,tar/2);
        else
        {
            return 1+brokenCalc(sv,tar+1);
        }
    }
}