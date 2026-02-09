import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);

        System.out.println("List: " + mylist);

        int element = mylist.get(2);
        System.out.println("Element at index 2: " + element);

        System.out.print("Elements: ");
        for (int i = 0; i < mylist.size(); i++) {
            System.out.print(mylist.get(i) + " ");
        }
        System.out.println();

        mylist.add(2, 99);
        System.out.println("After adding 99 at index 2: " + mylist);

        mylist.set(3, 55);
        System.out.println("After modifying index 3: " + mylist);

        mylist.remove(1);
        System.out.println("After removing index 1: " + mylist);

        mylist.remove(Integer.valueOf(30));
        System.out.println("After removing value 30: " + mylist);

        if (mylist.contains(99)) {
            System.out.println("99 is present in the list");
        } else {
            System.out.println("99 is not present in the list");
        }

        System.out.println("Size of list: " + mylist.size());
    }
}
