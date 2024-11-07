package Round2.Assignment.Matrix;

import java.util.Arrays;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] arr2 = {{2, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] res = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }

    }
}
