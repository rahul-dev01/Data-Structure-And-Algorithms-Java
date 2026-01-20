import java.util.Stack;

public class PostToPre {

    public static String postToPre(String postfix) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            }

            else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String exp = ch + op1 + op2;
                stack.push(exp);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        System.out.println("Prefix: " + postToPre(postfix));
    }
}
