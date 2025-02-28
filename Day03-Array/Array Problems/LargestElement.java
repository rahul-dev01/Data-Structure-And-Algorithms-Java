// Find the largest element in array

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of Array : ");
        int arr_length = sc.nextInt();

        int[] arr = new int[arr_length];

        for (int i = 0; i < arr_length; i++) {
            arr[i] = sc.nextInt();
        }
 
        int largest = 0 ;   // this variable is used to compare the element of array
         

        for (int i = 0; i < arr_length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest Element is : " + largest);

        sc.close();
    }
}
