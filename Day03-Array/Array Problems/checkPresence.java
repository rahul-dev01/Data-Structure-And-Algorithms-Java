// return the x element whoes is repeating in the array if not then retrun -1

import java.util.Scanner;

public class checkPresence {
    static int findFirstRepeating(int[] arr , int x  ) {
        int ans = -1 ;
        for (int i = 0; i <  arr.length; i++) {
           if(arr[i] == x){
            ans = i;
            break ;
           }
        }
        return ans ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int arr_length = sc.nextInt();

        int[] arr = new int[arr_length];
        

        for (int i = 0; i < arr_length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int n = sc.nextInt(); 

        int result = findFirstRepeating(arr, n);
        System.out.println("Index is : " + result);

        sc.close();
    }
}