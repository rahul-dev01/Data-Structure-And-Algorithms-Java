// Clone/Copy Of an Array


import java.util.Arrays;
import java.util.Scanner;

public class cloneOrCopying {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr_length = sc.nextInt();
        int[] arr = new int[arr_length];

        for (int i = 0; i < arr_length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array before deep copy : ");
        for (int i = 0; i < arr_length   ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //  Clone /  Copy

        int[] arr2 = Arrays.copyOfRange(arr, 0, 2);

        System.out.print("Array After clone copy : ");
        for (int i = 0; i < arr2.length   ; i++) {
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }
}
