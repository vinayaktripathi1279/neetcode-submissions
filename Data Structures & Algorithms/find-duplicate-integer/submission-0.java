// import java.util.HashMap;

class Solution {
    public int findDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer Key : map.keySet()) {
            if (map.get(Key) >= 2) {
                return Key;
            }
        }

        return -1;
    }
}
