public class Palindrome {
    public static void main(String[] args) {
        int num = 4567;
        int rev = 0 ;

        while (num != 0) {
            int digit = num % 10; 
            rev = rev * 10 + digit; 
            num = num / 10; 
        } 
        if( num == rev){
            System.out.println("Number is Palindrome");
        } 
        else{
            System.out.println("Number  is not a palindrome");
        }
    }
}
