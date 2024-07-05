package Programming_L2.Practice;

import java.util.Arrays;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 1, 2, 2, 6, 4};
        frequencyNumber(arr);
    }

    private static void frequencyNumber(int[] arr) {
        int[] countArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        for (int i = 0; i < countArr.length - 1; i++) {
            if (countArr[i] == 0) {
                continue;
            }
            System.out.println(i + "-" + countArr[i]);
        }
    }
}
