import java.util.Scanner;

public class takingArrayInput {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int arr_length = sc.nextInt();

        int arr[] = new int[arr_length] ;

        for(int i = 0 ; i < arr_length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is  : ");
        for(int i = 0 ; i <= arr.length ; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}