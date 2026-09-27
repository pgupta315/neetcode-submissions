class Solution {
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> closeBraces = new HashMap<>();
        closeBraces.put(']', '[');
        closeBraces.put('}', '{');
        closeBraces.put(')', '(');

        for (char c : s.toCharArray()) {
            if (closeBraces.containsKey(c)) {
                char openBrace = closeBraces.get(c);
                if (!stack.isEmpty() && stack.peek() == openBrace) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
