package Round2.Assignment.Matrix;

import java.util.Arrays;

public class MultiplicationOfArray {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 1},
                {3, 4, 1}};
        int[][] arr2 = {{5, 6},
                {7, 8}, {1, 2}};
        int[][] res = multiply(arr1, arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }

    static int[][] multiply(int[][] arr1, int[][] arr2) {

        int r1 = arr1.length;
        int c1 = arr1[0].length;

        int r2 = arr2.length;
        int c2 = arr2[0].length;

        if (c1 != r2) {
            return null;
        }
        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
//                    System.out.println(i + " " + j + " " + k);
                }

            }

        }

        return res;

    }
}
