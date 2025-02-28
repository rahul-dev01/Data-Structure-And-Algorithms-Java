// find total number of triplet whoes sum is equal to given value x 


import java.util.Scanner;

public class targetTripletSum {

    static int totalPairSum(int[] arr , int x ){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1  ; j < arr.length ; j++){
                for(int k = j + 1 ; k < arr.length ;  k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        System.out.println("Triplet: (" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                        count++;
                    }
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
        System.out.println("Total number of triplet sum equal to x : " + result);

        sc.close();
    }
}