
public class StringCheckEqual {

    public static void main(String[] args) {
        String s1 = "Hello"; 
        String s2 = "Mello";

        String s3 = "Hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        String str1 = "hello"; 
        String str2 = new String("hello");
        System.out.println(str1.equals(str2));      // true
        System.out.println(str1 ==str2);          // false
        
    }
    
}
