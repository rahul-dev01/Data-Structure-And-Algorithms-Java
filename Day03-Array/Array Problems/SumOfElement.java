// Calculate the sum of element of array  
import java.util.Scanner;
public class SumOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of Array : ");
        int arr_length = sc.nextInt();

        int[] arr = new int[arr_length];

        for (int i = 0; i < arr_length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of Array Elemnent : " + sum);
        sc.close();
    }
}
