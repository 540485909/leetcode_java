/**
 * 
 */
package easy;

/**
 * @author duanc
 *
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        for (int i = 0; i < prices.length - 1; ++i) {
        	prices[i] = prices[i + 1] - prices[i];
        }
        int localmax = 0;
        int globalmax = 0;
        for (int i = 0; i < prices.length - 1; ++i) {
        	localmax = Math.max(localmax + prices[i], prices[i]);
        	globalmax = Math.max(globalmax, localmax);
        }
        return globalmax;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
