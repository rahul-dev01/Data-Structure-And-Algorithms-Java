//Find GCD using recursion

import java.util.Scanner;

public class Question6 {

    static int FindGCD(int x, int y) {
        if(y == 0) return x ;

        return FindGCD(y, x % y);

    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();

        int result = FindGCD(x, y);

        int result2 = (x * y) / result ;

        System.out.println("GCD of " + x + " and " + y + " : " + result);
        System.out.println("LCM of " + x + " and " + y + " : " + result2);
        sc.close();
    }
}
