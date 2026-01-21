import java.util.*;

public class CopyingQueue {
    
    static void displayQueue(Queue<Integer> que){
        Queue<Integer> helper = new ArrayDeque<>();
        while(que.size() >= 1){
            int x = que.element() ;
            System.out.println(x);
            helper.add(x);
            que.remove();
        }

        // This helps us to resotre the queue 
        while(helper.size() >= 1){
            int x = helper.element() ;
            que.add(x) ;
            helper.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);

        displayQueue(que);
        System.out.println(que);
    }
}
