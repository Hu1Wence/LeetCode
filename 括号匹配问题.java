import java.util.Scanner;
import java.util.Stack;


public class Main {

    public static boolean isTrue(String line, Stack<Character> stack) {
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(' ||
                    line.charAt(i) == '[') {
                stack.push(line.charAt(i));
            } else if (line.charAt(i) == ')' ||
                    line.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (line.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (line.charAt(i) == ')' && stack.peek() != '(') {
                    return false;
                } else if (line.charAt(i) == ']' && stack.peek() == '(') {
                    return false;
                } else if (line.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                }
            }

        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String line = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean result = isTrue(line, stack);
            System.out.println(result);
        }
    }

}
