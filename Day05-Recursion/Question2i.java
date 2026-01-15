// Print the sum of n number 

public class Question2i{

    static int SeriesSum(int n) {
        if (n == 0)
            return 0;
        return SeriesSum(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println(SeriesSum(5));
    }
}
