// To find unique number in given array  

import java.util.Scanner;

public class uniqueNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr_length = sc.nextInt();
        int[] arr = new int[arr_length];

        for (int i = 0; i < arr_length; i++) {
            arr[i] = sc.nextInt();
        }
        
    

        sc.close();
    }
}

