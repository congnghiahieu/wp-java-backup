import java.util.Stack;

public class StackDriver {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < 100; i++) {
            st.push(i);
        }
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
