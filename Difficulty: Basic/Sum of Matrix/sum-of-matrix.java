class Solution {
    public int sumOfMatrix(int[][] mat) {
        int sum = 0;
        
        // Loop through each row in the matrix
        for (int[] row : mat) {
            // Loop through each number in the current row
            for (int num : row) {
                sum += num;
            }
        }
        
        return sum;
    }
}