import java.util.Stack;

public class PreToPost {
    public static String preToPost(String prefix) {
        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } 
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String exp = op1 + op2 + ch;
                stack.push(exp);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        System.out.println("Postfix: " + preToPost(prefix));
    }
}
