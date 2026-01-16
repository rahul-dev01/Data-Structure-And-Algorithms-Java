import java.util.Scanner;

public class factNumber {

    public static int calCulateFactorial(int n) { 
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calCulateFactorial(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(calCulateFactorial(number)); 
        sc.close();
    }
    
}
