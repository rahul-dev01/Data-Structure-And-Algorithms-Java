public class QuickSort {

    static void printArray (int[] arr ){
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }

    static void swap(int[]arr , int x , int y) {
        int temp = arr[x] ; 
        arr[x] = arr[y]; 
        arr[y] = temp ; 
    }

    static int partitionIndex(int[] arr , int st , int end ){
        int pivot = arr[st];
        int cnt = 0 ;               
        for(int i = st + 1 ; i <= end ; i++){
            if(arr[i] <= pivot) cnt++ ; 
        }
        int pivotIndex = st + cnt ; 

        swap(arr, st, pivotIndex);
        int i = st , j = end ;

        // element lesser or equal is on left and greater is on right side 
        while(i < pivotIndex && j > pivotIndex ){
            while(arr[i] <= pivot) i++ ; 
            while(arr[j] > pivot) j-- ;
            
            if(i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++ ; 
                j-- ; 
            }
        }
        return pivotIndex ; 
    }

    static void quickSort(int[] arr , int st , int end){
        if(st >= end) return ; 
        
        // pi = partition Index 
        int pi = partitionIndex(arr, st, end);

        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
    }



    public static void main(String[] args) {
        int[] arr = {6,3,1,5,4}; 

        System.out.println("Array Before Sorting : ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);
       
        System.out.println();
        System.out.println("Array After Sorting : ");
        printArray(arr);

    }
    
}
