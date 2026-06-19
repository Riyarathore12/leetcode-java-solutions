class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int max = 0;
        for(int i=0; i<=n; i++){
            int alt = 0;
            for(int j  = 0; j<i; j++){
                alt += gain[j];
            }
            max = Math.max(max , alt);

        }
        return max;
    }
}