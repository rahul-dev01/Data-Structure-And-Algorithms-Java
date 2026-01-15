// Given an int array arr , move all the 0's to the ens of it while maitaing the relative order of non zero element  // Bubble Sort


public class SortQuestion {

    static void maintaingSort(int arr[]){
        for(int i = 0 ; i < arr.length -1 ; i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++ ){
                if(arr[j] == 0 && arr[j + 1] != 0){
                    int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ; 
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,5,0,3,42} ;

        maintaingSort(arr) ;

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
