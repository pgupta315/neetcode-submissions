class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        // if (start > end) {
        //     return -1;
        // }
        // if (start == end) {
        //     if (nums[start] == target)
        //         return start;
        //     else 
        //         return -1;
        // }
        // int mid = (end+start) / 2 ; 

        while (start <= end) {
            int mid = (end+start) / 2 ; 
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
