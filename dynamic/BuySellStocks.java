package dynamic;

public class BuySellStocks {
    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            minPrice = Math.min(prices[i], minPrice);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BuySellStocks stockTrader = new BuySellStocks();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = stockTrader.maxProfit(prices);
        System.out.println("Maximum profit from stock trading is: " + result); // Output: 5
    }
}
