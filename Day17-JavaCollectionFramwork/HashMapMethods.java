import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // put()
        map.put(1, "Java");
        map.put(2, "Python");

        // get()
        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Java"));

        System.out.println(map.keySet());

        System.out.println(map.values());

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        map.remove(2);

        System.out.println(map.size());

        map.clear();
        System.out.println(map);
    }
}
