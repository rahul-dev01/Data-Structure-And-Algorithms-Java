// Deep copy Of an Array
    
import java.util.Arrays;
import java.util.Scanner;

public class deepCopy {

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
        //  Deep Copy

        int[] arr2 = Arrays.copyOf(arr, arr_length);

        System.out.print("Array After deep copy : ");
        for (int i = 0; i < arr2.length   ; i++) {
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }
}