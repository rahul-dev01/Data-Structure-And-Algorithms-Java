import java.util.*;

public class PriorityQueueMethods {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq.peek());
        System.out.println(pq.poll());

        System.out.println(pq.size());

        System.out.println(pq.contains(30));

        System.out.println(pq);
    }
}
