package algorithms.easy;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int differwnce;

        for (int i = 0; i < nums.length; i++) {
            differwnce = target - nums[i];
            if (map.containsKey(differwnce)) {
                return new int[] {i, map.get(differwnce)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solutions found!");
    }
}
