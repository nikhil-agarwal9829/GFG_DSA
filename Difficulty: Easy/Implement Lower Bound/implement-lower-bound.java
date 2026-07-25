class Solution {
    int lowerBound(int[] arr, int target) {
        int l=0;
        int r=arr.length-1;
        int min=arr.length;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=target){
                min=Math.min(min,mid);
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        
        return min;
    }
}
