

public class StringBuilderInString {
    public static void main(String[] args) {
       StringBuilder str = new StringBuilder("Hello");  
       str.append(" World");   // This will not create a new heap memory . this is going to append on the hello 

        str.setCharAt(0 ,'M'); 

       System.out.println(str);

       str.insert(1, 'h');

       System.out.println(str);

       StringBuilder str1 =  new StringBuilder("hello");

       str1.deleteCharAt(1);
       System.out.println(str1);

       str1.reverse();
       System.out.println(str1);

    }    
}