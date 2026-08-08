class Solution {
    public ArrayList<Integer> sortByFreq(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

       
        Integer[] nums = map.keySet().toArray(new Integer[0]);

        // Sort
        Arrays.sort(nums, (a, b) -> {

            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a); // higher frequency first
            }

            return a - b; // smaller number first
        });

        // Build answer
        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : nums) {
            for (int i = 0; i < map.get(x); i++) {
                ans.add(x);
            }
        }

        return ans;
    }
}