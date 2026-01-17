public class BinarySearchRecursive {

    static int binarySearchRecursive(int[] nums ,int st , int end , int target){
        while (st <= end) {
            int mid = (st + end)/2 ; 

            if(nums[mid]== target) {
                return mid; 
            }
            else if(nums[mid] > target) { 
                return binarySearchRecursive(nums, st, mid - 1, target) ; 
            }
             else{
                return binarySearchRecursive(nums, mid + 1, end, target);
            }
         }

        return -1 ;  
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 5 ; 

        int n = arr.length ; 

        int result = binarySearchRecursive(arr,0 , n - 1 , target);

        System.out.println("The index of Target " + target + "  is : " + result );
    }
}
