import java.util.*;

public class HashSetMethods {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set.contains(20));

        System.out.println(set.size());

        set.remove(10);

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set);
    }
}
