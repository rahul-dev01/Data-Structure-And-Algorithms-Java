// Count number of occurance of element x in array

import java.util.Scanner;

public class NumberOfOccurance {

    static int occurance(int x,int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i])
            count++;
        }return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int number=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=occurance(number, arr);
        System.out.println(temp);
        
        sc.close(); 
    }
}
