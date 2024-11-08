package Round2.Assignment.Interval;

import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res = mergeInterVal(arr);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] mergeInterVal(int[][] arr) {

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        Stack<int[]> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int[] current = arr[i];
            int[] top = stack.peek();

            if (top[1] < current[0]) {
                stack.push(current);
            } else {
                top[1] = Math.max(current[1], top[1]);
            }
        }
        int[][] op = new int[stack.size()][2];

        for (int i = op.length - 1; i >= 0; i--) {
            op[i] = stack.pop();
        }

        return op;
    }
}
