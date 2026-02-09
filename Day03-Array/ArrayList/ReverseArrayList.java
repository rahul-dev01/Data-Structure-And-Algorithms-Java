import java.util.*;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        mylist.add(50);

        System.out.println("Original List: " + mylist);

        int start = 0;
        int end = mylist.size() - 1;

        while (start < end) {
            int temp = mylist.get(start);
            mylist.set(start, mylist.get(end));
            mylist.set(end, temp);

            start++;
            end--;
        }

        System.out.println("Reversed List: " + mylist);
    }
}
