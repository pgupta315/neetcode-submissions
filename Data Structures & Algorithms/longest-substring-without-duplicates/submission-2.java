class Solution {
    public int lengthOfLongestSubstring(String s) {
        // sliding window problem
        HashMap<Character, Integer> map = new HashMap<>();
        int l=0, r=0, longest=0;

        while (l<=r && r<s.length()) {
            // System.out.println("left cursor: " + l + "right: " + r);
            // map.merge(s.charAt(l), 1, Integer::sum);
            char rightChar = s.charAt(r);
            // System.out.println("rightChar: " + rightChar);
            if (!map.containsKey(rightChar)) {
                map.put(rightChar, 1);
                longest = Math.max(longest, r-l+1);
                // System.out.println("longest:" + longest);
                r++;
            } else {
                while (s.charAt(l) != rightChar) {
                    // remove the char pointed by the left cursor from the map
                    // System.out.println("left cursor: " + l + "left char:" + s.charAt(l));
                    map.compute(s.charAt(l), (key, oldValue) -> --oldValue == 0 ? null : oldValue);
                    l++;
                }
                l++;
                r++;
            }
        }
        return longest;
    }
}
