class Solution {
    public int countZeros(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }



        int m = grid.length;
        int n = grid[0].length;

        int row = 0;
        int col = n - 1;
        int count = 0;

        while (row < m && col >= 0) {

            if (grid[row][col] > 0) {
                count += m - row;
                col--;
            } else {
                row++;
            }
        }
        

        return (m*n)-count;
    }
}
        
