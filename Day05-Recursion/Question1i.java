// Given a number num and a value k . Print k multiple of num
// f(n , k) = 5 , 10 , 15 , 20

public class Question1i {

    static void PrintMultiple(int n , int k) {
        // if(k == 1){
        //     System.out.println(n);
        //     return ;
        // }
        // PrintMultiple(n, k-1);
        // System.out.println(n * k);

        // Method 2


        if(k==0) return ;
        PrintMultiple(n, k  - 1);
        System.out.println(n * k);
    }

    public static void main(String[] args) {
        PrintMultiple(5, 4);
    }
}