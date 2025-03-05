// find second largest number in given array 

import java.util.Scanner;    

public class secondLargest {

    static int secondLargestNumber(int[] arr){
        int secLarge = 0 ;
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] > secLarge){
                secLarge = arr[i];
                
            }
        }
        return secLarge ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr_length = sc.nextInt();
        int[] arr = new int[arr_length];

        for (int i = 0; i < arr_length; i++) {
            arr[i] = sc.nextInt();
        }

        secondLargestNumber(arr);
        System.out.println("Second Largest Number : " + secondLargestNumber(arr));
        sc.close();
    }
}