package Round2.Assignment.Matrix;

import java.util.Arrays;

public class TransposedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 4}};
        int row = arr.length;
        int col = arr[0].length;
        int[][] res = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[j][i] = arr[i][j];
            }
        }


        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
