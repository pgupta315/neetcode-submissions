class Solution {
    public boolean isAnagram(String s, String t) {
        int [] sChars = new int[26];
        int [] tChars = new int[26];

        setChars(sChars, s);
        setChars(tChars, t);

        for (int i = 0; i<26; i++) {
            if (sChars[i] != tChars[i]) {
                return false;
            }
        }
        return true;
    }

    void setChars(int[] charCount, String str) {
        for (char ch: str.toCharArray()) {
            int index = ch - 'a';
            charCount[index] ++;
        }
    }
}
