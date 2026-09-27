class Solution {
    public int lengthOfLongestSubstring(String s) {
        // sliding window problem
        HashMap<Character, Integer> map = new HashMap<>();
        int l=0,  longest=0;

        for (int r = 0; r < s.length(); r++) {
            char rightChar = s.charAt(r);
            if (map.containsKey(rightChar)) {
                // shift l to last position + 1
                l = Math.max(map.get(rightChar) + 1, l);
            }
            // update the new position in the map
            map.put(rightChar, r);
            longest = Math.max(longest, r-l+1);
        }
        return longest;
    }
}
