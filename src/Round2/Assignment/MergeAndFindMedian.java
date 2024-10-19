package Round2.Assignment;

import java.util.Arrays;

public class MergeAndFindMedian {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5};
        int[] arr2 = {2, 3, 6, 8};
        int[] res = new int[arr1.length + arr2.length];
        findMedian(arr1, arr2, res);
    }

    static void findMedian(int[] arr1, int[] arr2, int[] res) {
        int i = 0;
        int j = 0;
        int k = 0;


        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            res[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            res[k++] = arr2[j++];
        }

        int mid = res.length / 2;
        float median = 0;
        if (res.length % 2 == 0) {
            int f1 = res[mid - 1];
            int f2 = res[mid];
            median = (float) (f1 + f2) / 2;
        } else {
            median = res[mid];
        }
        System.out.println(Arrays.toString(res));
    }
}
