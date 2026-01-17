// Find the minimum element of rotated array : 

public class BinaryRotatingArray {

    static int findMinimum(int[] arr ) {
        int st = 0 , end = arr.length - 1 ;
        int n = arr.length ;
        int ans = -1 ;
        
        while(st <= end){
            int mid = st + (end - st) /2 ; 
            if(arr[mid] <= arr[n-1]){
                ans = mid ;
                end = mid - 1 ; 
            }
            else{
                st  = mid + 1 ;
            }
        }
        return ans ; 
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3} ; 

        int result = findMinimum(arr) ; 
        System.out.println("The index of minimum nuumber is : " + result);
    }
}
