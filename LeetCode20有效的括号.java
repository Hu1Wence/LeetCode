class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char achar : chars) {
            if (achar == '(' || achar == '{' || achar == '[') {
                stack.push(achar);
                continue;
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if (c == '(' && achar != ')') {
                    return false;
                } else if (c == '[' && achar != ']') {
                    return false;
                } else if (c == '{' && achar != '}') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}