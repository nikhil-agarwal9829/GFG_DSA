import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> multiplyMatrices(int[][] a, int[][] b) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        // Guard clause for empty arrays
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return result;
        }
        
        int n = a.length;       // Rows of A
        int m = a[0].length;    // Columns of A (and Rows of B)
        int p = b[0].length;    // Columns of B
        
        // Loop through each row of matrix A
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> currentRow = new ArrayList<>();
            
            // Loop through each column of matrix B
            for (int j = 0; j < p; j++) {
                int sum = 0;
                
                // Calculate the dot product of A's row i and B's column j
                for (int k = 0; k < m; k++) {
                    sum += a[i][k] * b[k][j];
                }
                
                currentRow.add(sum);
            }
            
            // Add the fully calculated row to our final matrix
            result.add(currentRow);
        }
        
        return result;
    }
}