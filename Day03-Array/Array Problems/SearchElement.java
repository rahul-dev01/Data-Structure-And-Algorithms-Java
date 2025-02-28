// Search the given element x in the array if present then return the index else return -1 


import java.util.Scanner;
public class SearchElement {

    static int FindNumber(int[] arr , int x ){
        int result = -1 ;
        for(int i = 0 ; i <= arr.length - 1 ; i++){
            if(arr[i] == x){
                result = i ; 
            }
            else{
                return result ;
            }
        }
        return result ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt() ;

        int[] arr =  {1,2,3,4,34,5,6,7,8} ; 

        System.out.println("The index of given Number is :  "+ FindNumber(arr, num));

        sc.close();
    }
    
}
