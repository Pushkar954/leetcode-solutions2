class Solution {
    public long countCommas(long n) {
        // if(n<1000) return 0;
        // return Math.max(0,n-999);
        long c=0;
        long t=1000;
        while(t<=n){
            c+=n-t+1;
            t*=1000;
        }
        return c;
    }                                                                                                                                                                                                                                               
}