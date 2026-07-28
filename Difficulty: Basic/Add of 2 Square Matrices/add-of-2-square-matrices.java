class Solution {
    public void addMat(int[][] a, int[][] b) {
        // Guard clause to handle empty matrices safely
        if (a == null || a.length == 0 || a[0].length == 0) {
            return;
        }
        
        int n = a.length;
        int m = a[0].length;
        
        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < m; j++) {
                // Add the corresponding element from b into a
                a[i][j] += b[i][j];
            }
        }
    }
}