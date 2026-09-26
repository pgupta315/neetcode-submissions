class Solution {
    public boolean isPalindrome(String s) {
        // two pointers
        s = s.toLowerCase();
        int i = 0, j = s.length()-1;

        while (i < j) {
            if (!isValid(s.charAt(i))) {
                i++;
                continue;
            }
            if (!isValid(s.charAt(j))) {
                j--;
                continue;
            }
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isValid(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
            return true;
        }
        return false;
    }
}
