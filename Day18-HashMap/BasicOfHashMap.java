// Crate a hashMap using java  hasmap class to store the following pair (Person , Age)

import java.util.*;

public class BasicOfHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lavv", 17);
        mp.put("Harry", 18);

        System.out.println(mp.get("Yash"));

        mp.put("Yash", 25);

        System.out.println(mp.get("Yash")); 

        System.out.println(mp.remove("Yash"));
        System.out.println(mp.remove("Raj"));

        System.out.println(mp.containsKey("Raj")); 
        System.out.println(mp.containsKey("Lavv"));

        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());

        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d \n" , key , mp.get(key));
        }
        System.out.println();

        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d \n" , e.getKey() , e.getValue());
        }
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d \n" , e.getKey() , e.getValue());
        }
    }
}