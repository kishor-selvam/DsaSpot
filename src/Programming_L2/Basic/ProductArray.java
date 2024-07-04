package Programming_L2.Basic;

public class ProductArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1};
        productFun(arr);
    }

    private static void productFun(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.println(product);
    }
}
