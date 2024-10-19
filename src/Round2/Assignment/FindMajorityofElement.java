package Round2.Assignment;

public class FindMajorityofElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2};
        int count = 0;
        int majority = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == majority) {
                count++;
            } else {
                majority = arr[i];
                count--;
            }
        }
        System.out.println(count);


    }
}
