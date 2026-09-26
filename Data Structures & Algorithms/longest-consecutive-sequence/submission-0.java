/*
[2,20,4,10,3,4,5,11,13,12]
[20,2,4,10,3,4,5]  


*/
class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> numFound = new HashMap<>();

        for (int num : nums) {
            numFound.put (num, false);
        }

        int max = 0;
        for (int num : nums) {
            int count = 1;
            // hasn't been found
            if (numFound.get(num) == false) {
                int lower = num-1;
                // find the bottom 
                while (numFound.containsKey(lower) && numFound.get(lower) == false) {
                    numFound.put(lower, true);
                    lower--;
                    count++;
                }

                int upper = num+1;
                // find the top
                while (numFound.containsKey(upper) && (numFound.get(upper) == false)) {
                    numFound.put(upper, true);
                    upper++;
                    count++;
                }
            }
            max = Math.max(max, count);
        }

        return max;
    }
}
