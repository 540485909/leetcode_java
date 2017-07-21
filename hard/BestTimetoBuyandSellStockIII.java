package hard;

public class BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {
    	 if (prices.length <= 1) {
             return 0;
         }
         for (int i = 0; i < prices.length - 1; ++i) {
         	prices[i] = prices[i + 1] - prices[i];
         }
         int [][] dp = new int[3][prices.length];
         int globalValue = 0;
         for (int i = 1; i <= 2; ++i) {
         		int maxValue = Integer.MIN_VALUE;
         	for (int j = i; j <= prices.length - 1; ++j) {
         		//int maxValue = Integer.MIN_VALUE;
         		//for (int t = i - 1; t < j; ++t) {
         		//	maxValue = Math.max(maxValue, dp[i - 1][t]);
         		//}
         		
         		dp[i][j] = Math.max(dp[i][j - 1], maxValue) + prices[j - 1];
         		globalValue = Math.max(globalValue, dp[i][j]);
         		maxValue = Math.max(dp[i - 1][j - 1], maxValue);
         	}
         }
         
     
         return globalValue;
    }
    public static void main(String[] args) {
    	BestTimetoBuyandSellStockIII bbs = new BestTimetoBuyandSellStockIII();
    	System.out.println(bbs.maxProfit(new int[]{1,4,2,7}));
    }
}
