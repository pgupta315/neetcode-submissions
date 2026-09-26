class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] numArr = new int[2001];

        for (int num: nums) {
            numArr[num+1000]++;
        }

        int curr = 0;
        for (int i = 2000; i >= 0; i--) {
            if (numArr[i] > 0) {
                curr += numArr[i];
            }
            if (curr >= k) {
                return i-1000;
            }
        }
        return -1;
    }
}
