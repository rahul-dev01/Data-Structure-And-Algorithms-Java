// fiboaccci Series of number n 

public class Question4i {
    
    static int fib(int n) {
        if( n == 0 || n == 1 ){
            return n ;
        }

        // int prev = fib(n - 1) ;
        // int prevprev = fib(n - 2);
        // return prev + prevprev ;

        return fib(n - 1 ) + fib(n -2 ) ;
      }

     public static void main(String[] args) {
        // System.out.println(fib(7)); 

        // fibonacci Series upto n 

        for (int i = 0 ; i < 10 ; i++){
            System.out.println(fib(i));
        }
     }
}
