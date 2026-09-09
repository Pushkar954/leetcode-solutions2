class Solution {
    public long countCommas(long n) {
        long c=0;
        long t=1000;
        while(t<=n){
            c+=n-t+1;
            t*=1000;
        }
        return c;
    }
}