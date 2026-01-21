import java.util.*;

public class BasicOfQueue {
    public static void main(String[] args) {
        // Queue<Integer> que = new ArrayDeque<>() ;
        Queue<Integer> que = new LinkedList<>();

        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);

        // System.out.println(que.size());
        // System.out.println(que);

        // que.remove();
        // System.out.println(que);

        // que.poll();
        // System.out.println(que);

        // System.out.println(que.element());
        // System.out.println(que.peek());

        // System.out.println(que);
    
        // System.out.println(que.isEmpty());

        Queue<Integer> helper = new ArrayDeque<>();
        

        while(que.size() >= 1){
            int x = que.element() ;
            System.out.println(x);
            helper.add(x);
            que.remove();
        }

        System.out.println(helper);
        System.out.println(que); // here i loose the queue
    } 
}
