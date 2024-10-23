package Leetcode.Easy;

// Problem 121
public class BestTimetoSellandBuyStock {
    public static void main(String[] args) {
//        int[] arr = {7, 1, 5, 3, 6, 4};
        int[] arr = {7, 6, 4, 3, 1};
        System.out.println(sellAndBuy(arr));
    }

    static int sellAndBuy(int[] prices) {
        int lowStart = prices[0];
        int highStart = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowStart) {
                lowStart = prices[i];
            }
            if (prices[i] > highStart && prices[i] > lowStart) {
                highStart = prices[i];
            }

        }
        int ans = highStart - lowStart;
        return Math.max(ans, 0);
    }
}
