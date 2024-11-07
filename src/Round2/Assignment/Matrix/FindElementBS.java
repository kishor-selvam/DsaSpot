package Round2.Assignment.Matrix;

import java.util.Arrays;

public class FindElementBS {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int k = 12;
        System.out.println(Arrays.toString(findElement(arr, k)));
    }

    static int[] findElement(int[][] arr, int target) {

        int row = 0;
        int col = arr[0].length - 1;

        while (row <= arr.length - 1 && col >= 0) {
            int val = arr[row][col];
            if (val == target) {
                return new int[]{row, col};
            } else if (val < target) {
                row++;
            } else {
                col--;
            }
        }
        return null;
    }
}
