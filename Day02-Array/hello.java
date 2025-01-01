import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int array_length = sc.nextInt();

        int[] numbers = new int[array_length];

        
        for (int i = 0; i < array_length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        } 
    }
}