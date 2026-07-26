class Solution {
    public int median(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find the minimum and maximum values
        for (int i = 0; i < rows; i++) {
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][cols - 1]);
        }

        int required = (rows * cols) / 2;

        while (low < high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            // Count elements <= mid
            for (int i = 0; i < rows; i++) {
                count += upperBound(mat[i], mid);
            }

            if (count <= required) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    // Returns number of elements <= target
    private int upperBound(int[] arr, int target) {

        int l = 0;
        int r = arr.length;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}