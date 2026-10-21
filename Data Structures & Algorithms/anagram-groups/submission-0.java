
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // result map of str to list<Str>
        Map <String, List<String>> map = new HashMap<>();
        // iterate through the strs arr  
        for (String str: strs) {
            // countArr of size 26 init
            int[] countArr = new int[26];
            // iterate through the individual str char arr
            for (char ch : str.toCharArray()) {
                // increment the char slot on countArr 
                countArr[ch-'a']++;
            }
            // construct the sorted word from countArr
            String sortedWord = Arrays.toString(countArr);
            // add the sorted word to result map
            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(str);
        }
        
        // return the values of map
        return new ArrayList<> (map.values());
    }

    public String constructWord(int[] countArr) {
        String word = "";
        for (int i = 0; i<26; i++) {
            int count = countArr[i];
            while (count-- > 1) {
                char ch = (char) (i + 65);
                word = word + ch;
            }
        }
        return word;
    }
}
