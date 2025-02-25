// Write a progrmam to print all natural number from 1 to n using recursion 

import java.util.Scanner;

public class Question1 {
    
    public static void printIncreasing(int n) {
        if (n == 0) {  
            return;
        }
        printIncreasing(n - 1);  
        System.out.println(n); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Natural numbers from 1 to " + n + ":");
        printIncreasing(n);

        sc.close();
    }
    
}