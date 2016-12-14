/**
 * Created by jinzichen on 2016/12/15.
 *
 * 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0], result = 0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > result) {
                result = price - minPrice;
            }
        }
        return result;
    }
}
