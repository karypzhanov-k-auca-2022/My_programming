package Problems.leetcode;

public class maxProfitt {
     public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        maxProfitt m = new maxProfitt();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(m.maxProfit(prices)); // Output: 5
        int[] prices2 = { 7, 6, 4, 3, 1 };
        System.out.println(m.maxProfit(prices2)); // Output: 0
    }
}
