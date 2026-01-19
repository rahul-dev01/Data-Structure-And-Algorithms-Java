import java.util.*;

public class UnderFlowAndOverFlow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(5);
        st.push(90);
        st.push(5);
        st.push(56);
        
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);



        
        // st.pop();
        // System.out.println(st);

        // this error is called underFlow

        // Exception in thread "main" java.util.EmptyStackException
        // at java.base/java.util.Stack.peek(Stack.java:101)
        // at java.base/java.util.Stack.pop(Stack.java:83)
        // at UnderFlowAndOverFlow.main(UnderFlowAndOverFlow.java:23)
    }
}
