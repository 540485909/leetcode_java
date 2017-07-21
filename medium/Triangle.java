/**
 * 
 */
package medium;

import java.util.List;

/**
 * @author duanc
 *
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int[][] dp = new int[2][row + 1];
        for (int j = 1; j <= row; ++j) {
        	dp[row][j] = triangle.get(row - 1).get(j - 1);
        }
        for (int i = row ; i >= 1; --i) {
        	for (int j = i; j >= 1; --j) {
        		dp[i - 1 & 1][j - 1] = Math.min(dp[i & 1][j - 1], dp[i & 1][j]) + triangle.get(i - 1).get(j - 1);
        	}
        }
        return dp[0][0];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
