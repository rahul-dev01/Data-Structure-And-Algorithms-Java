import java.util.HashMap;

public class QuestionLargestSubArraySum {

    static int findLargestSubArray(int[] arr){
        HashMap<Integer , Integer> myMap = new HashMap<>();
        int maxLen = 0 , prefixSum = 0; 

        for(int i = 0 ; i < arr.length ; i++){
            prefixSum += arr[i];
            if(myMap.containsKey(prefixSum)){
                maxLen = Math.max(maxLen, i - myMap.get(prefixSum));
            }
            else{
                myMap.put(prefixSum, i);
            }
        }
        return maxLen ;
    }

    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,23} ;
        System.out.println(findLargestSubArray(arr));
    }
}
