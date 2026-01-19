import java.util.Stack;

public class BasicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(5);
        st.push(90);
        st.push(5);
        st.push(56);
        st.pop();

       
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("Size of stack is : " + st.size());

        // Prining 1st Element of Stack  
        //This going to lose my stack 

        while (st.size() > 1) {
            st.pop() ; 
        }
        System.out.println(st.peek());
    }
}
