class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        for (String str: strs) {
            int length = str.length();
            encodedStr.append(length);
            encodedStr.append("_");
            encodedStr.append(str);
        }
        System.out.println("encoded str: " + encodedStr);
        return encodedStr.toString();
        // 5_hello10_chimpanzee
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> decodedStr = new ArrayList<>();
        while (i < str.length()) {
            int _index = str.indexOf("_", i);
            int len = Integer.parseInt(str.substring(i, _index));
            String singleStr = str.substring(_index+1, _index+len+1);
            decodedStr.add(singleStr);
            i = _index+len+1;
        }
        return decodedStr;
        // {hello, world}
    }
}
