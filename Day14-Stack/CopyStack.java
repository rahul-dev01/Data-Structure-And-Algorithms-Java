import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        // System.out.print( "Enter the size of stack : ");
        // int sizeOfStack = sc.nextInt() ;

        // System.out.println("Enter the element of stack : ");
        // for(int i = 1 ; i < sizeOfStack ; i++){
        // int element = sc.nextInt();
        // st.push(element) ;
        // }

        // System.out.println("Stack is : " + st);

        st.push(3);
        st.push(5);
        st.push(90);
        st.push(5);
        st.push(56);

        Stack<Integer> newStack = new Stack<>();
        Stack<Integer> copyStack = new Stack<>();

        while (st.size() > 0) {
            newStack.push(st.pop());
        }

        System.out.println(st);
        System.out.println(newStack);
        System.out.println(copyStack);

        while (newStack.size() > 0) {
            int val = newStack.pop();
            st.push(val);
            copyStack.push(val);
        }

        System.out.println(st);
        System.out.println(newStack); 
        System.out.println(copyStack);

        sc.close();
    }
}
