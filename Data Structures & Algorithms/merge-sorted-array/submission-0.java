class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m-1;
        int nIndex = n-1;
        int currIndex = m+n-1;

        while (mIndex >= 0 && nIndex >=0) {
            if (nums1[mIndex] >= nums2[nIndex]) {
                nums1[currIndex--] = nums1[mIndex];
                mIndex--;
            } else {
                nums1[currIndex--] = nums2[nIndex];
                nIndex--;
            }
        }
        while (mIndex >= 0) {
            nums1[currIndex--] = nums1[mIndex];
            mIndex--;
        }
        while (nIndex >= 0) {
            nums1[currIndex--] = nums2[nIndex];
            nIndex--;
        }
    }
}