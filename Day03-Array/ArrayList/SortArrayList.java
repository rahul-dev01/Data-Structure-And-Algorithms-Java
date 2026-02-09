import java.util.*;

public class SortArrayList {

    public static void main(String[] args) {

        ArrayList<String> mylist = new ArrayList<>();

        mylist.add("banana");
        mylist.add("apple");
        mylist.add("orange");
        mylist.add("grape");
        mylist.add("kiwi");

        System.out.println("Original List: " + mylist);

        // 🔼 Ascending order (A → Z)
        for (int i = 0; i < mylist.size(); i++) {
            for (int j = 0; j < mylist.size() - i - 1; j++) {

                if (mylist.get(j).compareTo(mylist.get(j + 1)) > 0) {
                    String temp = mylist.get(j);
                    mylist.set(j, mylist.get(j + 1));
                    mylist.set(j + 1, temp);
                }
            }
        }

        System.out.println("Ascending Order: " + mylist);

        for (int i = 0; i < mylist.size(); i++) {
            for (int j = 0; j < mylist.size() - i - 1; j++) {

                if (mylist.get(j).compareTo(mylist.get(j + 1)) < 0) {
                    String temp = mylist.get(j);
                    mylist.set(j, mylist.get(j + 1));
                    mylist.set(j + 1, temp);
                }
            }
        }

        System.out.println("Descending Order: " + mylist);
    }
}
