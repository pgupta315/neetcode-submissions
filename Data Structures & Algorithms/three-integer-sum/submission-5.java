class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort the nums
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            // two pointer search
            int left = i+1, right = len-1;
            while (left < right) {  // **might need other conditions
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    while (nums[left] == nums[++left] && left<right) {}
                } else if (sum > 0) {
                    while (nums[right] == nums[--right] && left<right) {}
                } else {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    while (nums[left] == nums[++left] && left<right) {}
                    while (nums[right] == nums[--right] && left<right) {}
                }
            }
            while ((i+1 < len) && nums[i] == nums[i+1]) {
                i++;
            }
        }
        return result;
    }
}
