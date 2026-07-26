class Solution {
    public int nthRoot(int n, int x ) {
        if (x < 2) return x;
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long a=1;
            for(int i=1;i<=n;i++){
                a*=mid;
                if(x<a){
                    break;
                }
            }
            
            if (a==x) return mid;
            else if (a < x) {
                left = mid + 1;
            } else right = mid - 1;
        }
        return -1;
    }
}
