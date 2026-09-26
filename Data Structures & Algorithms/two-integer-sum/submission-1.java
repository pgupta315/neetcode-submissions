class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i=0; i<nums.length; i++ ) {
            map.computeIfAbsent(nums[i], key -> new ArrayList<>()).add(i);
        }

        for (int num: nums) {
            int remaining = target - num;
            if (map.containsKey(remaining)) {
                if (num == remaining) {
                    if (map.get(num).size() >= 2) {
                        return new int[] {map.get(num).get(0), map.get(num).get(1)};
                    }
                } else {
                    return new int[] {map.get(num).get(0), map.get(remaining).get(0)};
                }
            }
        }
        return new int[] {0,1};
    }
}
