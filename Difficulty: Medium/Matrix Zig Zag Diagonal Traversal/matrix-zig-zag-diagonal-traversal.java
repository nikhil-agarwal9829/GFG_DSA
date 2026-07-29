class Solution {
    public List<Integer> matrixDiagonally(int[][] mat) {

        int n = mat.length;
        List<Integer> ans = new ArrayList<>();

        for (int d = 0; d <= 2 * n - 2; d++) {

            ArrayList<Integer> temp = new ArrayList<>();

            int row = Math.min(d, n - 1);
            int col = d - row;

            while (row >= 0 && col < n) {
                temp.add(mat[row][col]);
                row--;
                col++;
            }

            if (d % 2 == 0) {
                // Even diagonal -> keep order
                ans.addAll(temp);
            } else {
                // Odd diagonal -> reverse
                for (int i = temp.size() - 1; i >= 0; i--) {
                    ans.add(temp.get(i));
                }
            }
        }

        return ans;
    }
}