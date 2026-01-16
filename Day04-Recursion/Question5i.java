// Find the sum of its digit using recurssion

public class Question5i {

    static int sod(int n) {
        if(n >= 0 && n <= 9){
            return n ;
        }
        int smallAns = sod(n/10);
        int ans = smallAns + n %10 ;
        
        return ans ;
    }

    public static void main(String[] args) {
        System.out.println(sod(44343434));
    }
}
