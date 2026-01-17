public class BinarySearch {

    static int binarySearchAlgo(int[] nums ,int target){
        int n = nums.length ; 
        int st = 0 , end = n -1 ; 

        while (st <= end) {
            int mid = (st + end)/2 ; 

            if(nums[mid]== target) {
                return mid; 
            }
            else if(nums[mid] > target) { 
                end = mid - 1 ;
            }
            else{
                st = mid + 1 ; 
            }
         }

        return -1 ;  
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 7 ; 

        int result = binarySearchAlgo(arr, target);

        System.out.println("The index of Target " + target + "  is : " + result );

    }
}
