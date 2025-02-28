// find total number of pair whoes sum is equal to given value x 

import java.util.Scanner;

public class targetSum {

    static int totalPairSum(int[] arr , int x ){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == x){
                    System.out.println("Triplet: (" + arr[i] + ", " + arr[j] + " )");
                    count++;
                }
            } 
        }
        return count ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr_length = sc.nextInt();

        int[] arr = new int[arr_length];

        for(int i = 0 ; i < arr_length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter x : ");
        int x = sc.nextInt();
        
        int result = totalPairSum(arr, x);
        System.out.println("Total number of pair sum equal to x : " + result);

        sc.close();
    }
}