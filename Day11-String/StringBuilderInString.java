

public class StringBuilderInString {
    public static void main(String[] args) {
       StringBuilder str = new StringBuilder("Hello");  
       str.append(" World");   // This will not create a new heap memory . this is going to append on the hello 
       System.out.println(str);
    }    
}