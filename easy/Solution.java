import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> vistos = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int falta = target - nums[i];

            if (vistos.containsKey(falta)) {
                return new int[]{vistos.get(falta), i};
            }

            vistos.put(nums[i], i);
        }

        return null;
    }
}
