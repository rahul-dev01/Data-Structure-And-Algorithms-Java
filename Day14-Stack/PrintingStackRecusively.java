import java.util.*;

public class PrintingStackRecusively {
    static void printStack(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        System.out.print(top + " ");
        printStack(st);
        st.push(top);
    }

    static void printStackReverse(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        printStackReverse(st);
        System.out.print(top + " ");
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(5);
        st.push(90);
        st.push(5);
        st.push(56);

        System.out.println("Reverse print:");
        printStackReverse(st);
        System.out.println();

        System.out.println("Normal print:");
        printStack(st);
        System.out.println();
    }
}
