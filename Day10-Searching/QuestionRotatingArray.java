// Search element in rotated sorted array with duplicate elements . Return true if the element is found else return false

public class QuestionRotatingArray {

    static int search(int[] arr , int target){

        int st = 0 , end = arr.length - 1 ; 
        while (st <= end) {
            int mid = st + (end - st)/2 ; 

            if(arr[mid] == target){
                return mid ;
            }

            else if(arr[st] == arr[mid] && arr[end] == arr[mid]){
                st++ ;
                end-- ; 
            }

            // Mid to End is sorted
            else if(arr[mid] <= arr[end]){
                if(target > arr[mid] && target <= arr[end]){
                    st = mid + 1 ; 
                }
                else{
                    end = mid - 1;;
                }
            }
            // st to mid is sorted 
            else{
                if(target >= arr[st] && target < arr[mid]){
                    end = mid - 1 ;
                }
                else{
                    st = mid + 1 ;
                }
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,1} ; 
        int target = 1 ; 

        
        int result = search(arr, target) ; 
        System.out.println("The index of minimum nuumber is : " + result);
    }
}
