/*
pre-array : [1, 1, 2, 8] --> cant leave a 0 there. 1st entry has to be a 1?
post-array: [48, 24, 6, 1] --> 
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int[] result = new int[nums.length];

        int currentPre = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                currentPre = currentPre * nums[i-1];
            }
            pre[i] = currentPre;
        }

        int currentPost = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            if (i < nums.length-1) {
                currentPost = currentPost * nums[i+1];
            }
            post[i] = currentPost;
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = pre[i] * post[i];
        }
        return result;
    }
}  
