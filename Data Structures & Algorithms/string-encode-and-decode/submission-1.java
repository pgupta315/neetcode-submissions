class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String str: strs) {
            result.append(str.length()).append("#");
            result.append(str);
        }
        // System.out.println("result: " + result.toString());
        return result.toString();
    }

    public List<String> decode(String str) {
        System.out.println("str: " + str);
        List<String> result = new ArrayList<>();
        int i = 0;  // index
        while (i < str.length()) {
            int j = i; 
            while (str.charAt(j) != '#') {
                j++;
            }

            int size = Integer.valueOf(str.substring(i,j));
            // System.out.println("i: " + i + " size: " + size);
            String s = str.substring(j+1, j+size+1);
            // System.out.println("substr: " + s);
            result.add(s);
            i = j + size + 1;
        }
        return result;
    }
}
