// Finding Factorial of number n 

public class Question3i {
   static int FindFactorial(int n ){
    if(n == 0) return 1;
    
    int smallAns = FindFactorial(n - 1);

    int ans = n * smallAns ;
    
    return ans ;

    // Method 2 
    //  We can directly calculate the value of n in return statment 
    // return n * FindFactorial(n -1); 
    
   }
   
   public static void main(String[] args) {
    System.out.println(FindFactorial(7));
   }
}
