class Solution {
    public boolean validMountainArray(int[] arr) 
    {
        int n=arr.length;
        if(arr.length<=2) return false;
        
        
        if(arr[0]>=arr[1]) 
        {
            return false;
        }
        int p=-1;
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]) {
                p=i;
                break;
            }
            if(arr[i]==arr[i+1]) return false;
            
        }
        if(p==-1) return false;
        System.out.print("p="+p);
        while(p<arr.length-1)
        {
            if(arr[p]<=arr[p+1]) return false;
            p++;
        }
        return true;
    }
}