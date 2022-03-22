class Solution {
    public String getSmallestString(int n, int k) {
        char res[] = new char[n];
        Arrays.fill(res, 'a');
        k -= n;
        
        while(k > 0){
            res[--n] = (char)(Math.min(25, k)+97);
            k -= Math.min(25, k);
        }
        return String.valueOf(res);
    }
}