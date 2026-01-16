// Print decreasing order Recursion

import java.util.Scanner;

public class Question2i {

    static void PrintDecreasing(int n ){
        if(n ==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintDecreasing( n- 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        System.out.println("Decreasing Order is : ");
        PrintDecreasing(n);

        sc.close();
    }

}
