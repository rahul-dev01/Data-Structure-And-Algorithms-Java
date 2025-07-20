// Printing all element of array using Recursion 

public class Question1 {

    static void PrintArray(int[] arr, int idx) {

        if(idx == arr.length){
            return ;
        }

        // System.out.println( "Index : "+ idx  + " Element : " + arr[idx]);
        System.out.println(arr[idx]);

        PrintArray(arr, idx + 1);
    }

    public static void main(String[] args) {

        int [] arr = { 2 , 9 , 7 , 5 , 8 , 4 , 6 } ;

        PrintArray(arr, 0);
 
    }
}