import java.util.Stack;

public class Test {
    private Stack<Integer> A = new Stack<>();
    private Stack<Integer> B = new Stack<>();

    public void push(int x) {
        A.push(x);
        if (B == null) {
            B.push(x);
            return;
        }

        int num = B.peek();
        if (num > x) {
            num = x;
        }
        B.push(num);
    }

    public void pop() {
        A.pop();
        B.pop();
    }

    public int top() {
        return A.peek();
    }

    public int getMin() {
        return B.peek();
    }
}
