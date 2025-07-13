// Finding gcd using the long divison method

public class Question5 {

    static int FindGcd(int x , int y){
        while (x % y != 0) {
            int rem = x % y ;
            x = y ;
            y = rem ;
        }
        return y; 
    }
    
    public static void main(String[] args) {
        
        System.out.println(FindGcd(24, 15 ));
    }   
}
