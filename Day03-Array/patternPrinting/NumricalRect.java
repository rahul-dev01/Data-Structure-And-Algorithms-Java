// Expected Output

// 12345
// 23451
// 34512
// 45123
// 51234


public class NumricalRect {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {

            for (int j = i; j <= row; j++) {
                System.out.print(j);
            }

            for (int k = 1; k <= i - 1; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
