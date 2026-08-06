class Solution {

    static Boolean[][] dp;

    static boolean solve(int i, int target, int[] arr){

        if(target==0)
            return true;

        if(i==arr.length)
            return false;

        if(dp[i][target]!=null)
            return dp[i][target];

        boolean take=false;

        if(arr[i]<=target)
            take=solve(i+1,target-arr[i],arr);

        boolean skip=solve(i+1,target,arr);

        return dp[i][target]=take||skip;
    }
    


    public boolean checkSubsequenceSum(int[] arr, int k) {

        dp=new Boolean[arr.length][k+1];

        return solve(0,k,arr);
    }
}
        
