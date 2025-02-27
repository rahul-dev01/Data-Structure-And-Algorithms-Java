// Expected Output

// 123456
// 123456
// 123456
// 123456
// 123456

public class RectPattern {
    public static void main(String[] args) {
        int row = 5;
        int col = 6;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
