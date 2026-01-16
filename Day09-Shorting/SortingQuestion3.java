// Given an array where all its element are sorted in increasing order except this swapped element sort it in linear time Assuming there is no duplicate in this array

public class SortingQuestion3 {
    
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void findSwappedElemet(int[] arr) {

        if(arr.length < 1){             // Corner Cases
            return ; 
        }

        int x = -1  , y = -1 ; 
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i-1] > arr[i]){
                if(x == -1){            // it means this is first confit 
                    x = i - 1 ; 
                    y = i ;
                }
                else{                // for Second Conflit
                    y = i ;
                }
            }
        } 
        // if we fount both the conflit then we are going the swap the element to get the output 
        int temp = arr[x] ; 
        arr[x] = arr[y] ;
        arr[y] = temp ; 
    }
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,5,9,10} ; 
        System.out.print("Array Before Sorting : ");
        printArray(arr);

        System.out.println();

        findSwappedElemet(arr);

        System.out.print("Array After Sorting : ");
        printArray(arr);
        
    }
}
