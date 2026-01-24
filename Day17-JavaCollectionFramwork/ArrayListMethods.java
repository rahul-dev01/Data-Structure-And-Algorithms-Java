import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();


        list.add("Java");
        list.add("Python");
        list.add(1, "C++");
        System.out.println(list.get(0));

        list.set(1, "Spring");

        System.out.println(list.contains("Java"));

        System.out.println(list.size());

        list.remove("Python");

        System.out.println(list.indexOf("Java"));

        System.out.println(list.isEmpty());

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        list.clear();
        System.out.println(list);
    }
}
