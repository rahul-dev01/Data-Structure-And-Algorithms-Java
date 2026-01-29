import java.util.HashSet;

public class MethodOfHashSet {
    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);

        System.out.println(mySet);

        // check element is present 
        System.out.println(mySet.contains(3));

        // find size
        System.out.println("Size of set : " + mySet.size());

        // remove 
        mySet.remove(3);

        for(int i : mySet){
            System.out.print(i + " ");
        }

    }
}
