class Solution {
    public int firstIndex(int arr[]) {
        int l=0;
        int r=arr.length-1;
        int x=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            
            if(arr[mid]>0){
                x=mid;
                r=mid-1;
            }
            if(arr[mid]<=0){
                l=mid+1;
            }
        }
        return x;
    }
}