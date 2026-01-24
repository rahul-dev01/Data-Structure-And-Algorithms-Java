import java.util.*;

public class ArrayDequeMethods {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(20);
        System.out.println(dq);

        dq.offerFirst(5);
        dq.offerLast(30);
        
        System.out.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        dq.pollFirst();
        dq.pollLast();

        System.out.println(dq);
    }
}
