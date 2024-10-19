package Round2.Assignment.Assignment10;

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
        int[] res = new int[arr1.length + arr2.length];
        System.out.println(res.length);
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k++] = arr1[i++];
            } else if (arr2[j] < arr1[i]) {
                res[k++] = arr2[j++];
            } else {
                res[k++] = arr1[i++];
                j++;
            }
        }

        while (i < arr1.length) {
            res[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            res[k++] = arr2[j++];
        }

        int[] ans = Arrays.copyOf(res, k);

        System.out.println(Arrays.toString(ans));
    }
}
