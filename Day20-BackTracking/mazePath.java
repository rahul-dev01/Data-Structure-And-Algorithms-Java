public class mazePath {

    static int maze(int st_row, int st_cols, int end_row, int end_cols) {

        if (st_row == end_row && st_cols == end_cols) {
            return 1;
        }

        if (st_row > end_row || st_cols > end_cols) {
            return 0;
        }

        int right = maze(st_row, st_cols + 1, end_row, end_cols);
        int down  = maze(st_row + 1, st_cols, end_row, end_cols);

        return right + down;
    }

    public static void main(String[] args) {
        int row = 2;
        int cols = 2;
        int count = maze(1, 1, row, cols);
        System.out.println(count);
    }
}