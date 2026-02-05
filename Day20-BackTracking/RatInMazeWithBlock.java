public class RatInMazeWithBlock {

    static void maze(int st_row, int st_cols, int end_row, int end_cols,
                     String str, boolean[][] isVisited, int[][] mazeBlock) {

        if (st_row < 0 || st_cols < 0 || st_row >= end_row || st_cols >= end_cols) {
            return;
        }

        if (mazeBlock[st_row][st_cols] == 0) {
            return;
        }

        if (isVisited[st_row][st_cols] == true) {
            return;
        }

        if (st_row == end_row - 1 && st_cols == end_cols - 1) {
            System.out.println(str);
            return;
        }

        isVisited[st_row][st_cols] = true;

        maze(st_row, st_cols + 1, end_row, end_cols, str + "R", isVisited, mazeBlock);
        maze(st_row + 1, st_cols, end_row, end_cols, str + "D", isVisited, mazeBlock);
        maze(st_row, st_cols - 1, end_row, end_cols, str + "L", isVisited, mazeBlock);
        maze(st_row - 1, st_cols, end_row, end_cols, str + "U", isVisited, mazeBlock);

        isVisited[st_row][st_cols] = false;
    }

    public static void main(String[] args) {
        int row = 4;
        int cols = 6;

        boolean[][] isVisited = new boolean[row][cols];

        int[][] mazeBlock = {
            { 1, 1, 1, 1, 0, 1 },
            { 1, 0, 1, 1, 1, 1 },
            { 1, 1, 1, 0, 1, 1 },
            { 0, 1, 1, 1, 1, 1 }
        };

        maze(0, 0, row, cols, "", isVisited, mazeBlock);
    }
}
