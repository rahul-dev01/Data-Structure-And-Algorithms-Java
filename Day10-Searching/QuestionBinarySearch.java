// Find the square root of given non negative value x round it off to the nearest floor integer value 

// Input x = 4 , Output = 2
// Input x = 11 , Output = 3

public class QuestionBinarySearch {

    static int sqrt(int x) {

        int st = 0 , end = x ;
        int ans = -1 ; 

        while (st <= end) {
            int mid = st + (end-st)/2 ; 
            int val = mid*mid ; 

            if(val == x){
                return mid;     
            }
            else if(val < x ){
                ans = mid ; 
                st = mid + 1  ; 
            }
            else{
                end = mid - 1 ;
            }
        }
        return ans ; 
    }

    public static void main(String[] args) {
        int x = 24 ; 

        int result = sqrt(x);
        System.out.println(result);

    }
}
