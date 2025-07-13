// Find CD 
// This is simple and brute force method : Not a good approach

public class Question4 {

    
    public static void main(String[] args) {
        int x = 12 ;
        int y = 16 ;

        System.out.println("Common divisors of " + x + " and " + y + " are:");
        for (int i = 1; i <= Math.min(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                System.out.println(i);
            }
        }
    }
}
