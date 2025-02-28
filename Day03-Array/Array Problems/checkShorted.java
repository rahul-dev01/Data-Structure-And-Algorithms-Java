// check if array is shorrted or not


import java.util.Scanner;

public class checkShorted {
    static boolean checkShortedArray(int[] arr){

        boolean status =  true ;
        for (int i = 1; i < arr.length; i++) {
           if(arr[i] < arr[i - 1]){
               return false ; 
           }
        }
        return status ;       
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr_length = sc.nextInt();
        int[] arr = new int[arr_length];

        for (int i = 0; i < arr_length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Above is shorted : " + checkShortedArray(arr));
        sc.close();
    }
}

   