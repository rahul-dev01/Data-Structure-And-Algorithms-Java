// Given a number n , Find the sum of natural number till n but with alternate sign

// n = 5      1 - 2 + 3 - 4 + 5

import java.util.Scanner;

public class Question3 {

    static int SeriesSum(int n) {
        if (n == 0)
            return 0;
        if (n % 2 == 0) {
            return SeriesSum(n - 1) - n;
        } else {
            return SeriesSum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(SeriesSum(n));
        sc.close();
    }

}
