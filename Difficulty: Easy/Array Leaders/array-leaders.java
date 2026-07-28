class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> a = new ArrayList<>();
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            count = Math.max(count, arr[i]);

            if (arr[i] >= count) {
                a.add(arr[i]);
            }
        }

        Collections.reverse(a);
        return a;
    }
}