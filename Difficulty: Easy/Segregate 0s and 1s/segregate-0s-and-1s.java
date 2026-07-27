class Solution {
    void segregate0and1(int[] a) {
        // code here
        int n=a.length-1;
        int k=0;
        while(k<=n){
            if(a[k]==1 && a[n]==0){
                a[k]=0;
                a[n]=1;
                k++;
                n--;
                continue;
            }
            if(a[k]==1 && a[n]>0){
                n--;
                continue;
            }
            k++;
        }
    }
}
