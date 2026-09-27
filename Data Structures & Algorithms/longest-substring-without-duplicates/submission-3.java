class Solution {
    public int lengthOfLongestSubstring(String s) {
        // sliding window problem
        HashSet<Character> set = new HashSet<>();
        int l=0, r=0, longest=0;

        while (l<=r && r<s.length()) {
            // System.out.println("left cursor: " + l + "right: " + r);
            // map.merge(s.charAt(l), 1, Integer::sum);
            char rightChar = s.charAt(r);
            // System.out.println("rightChar: " + rightChar);
            if (!set.contains(rightChar)) {
                set.add(rightChar);
                longest = Math.max(longest, r-l+1);
                // System.out.println("longest:" + longest);
                r++;
            } else {
                while (s.charAt(l) != rightChar) {
                    // remove the char pointed by the left cursor from the map
                    // System.out.println("left cursor: " + l + "left char:" + s.charAt(l));
                    set.remove(s.charAt(l));
                    l++;
                }
                set.remove(s.charAt(l));
                l++;
            }
        }
        return longest;
    }
}
