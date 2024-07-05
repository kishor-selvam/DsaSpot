package Programming_L2.Practice;

import java.util.Arrays;

public class TwoArrayFreqSameOrNot {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 2, 3, 3};
        int[] arr2 = {4, 3, 2, 2, 3};
        System.out.println(freqSameorNot(arr1, arr2));

    }

    //    Time complexity = O(n)
    //    Space complexity = O(1)
    static boolean freqSameorNot(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        int[] freqArr1 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            freqArr1[arr1[i]]++;
        }
        for (int i = 0; i < arr2.length; i++) {
            freqArr1[arr2[i]]--;
        }
        for (int i = 0; i < freqArr1.length; i++) {
            if (freqArr1[i] != 0) {
                return false;
            }
        }
        return true;

    }
}
