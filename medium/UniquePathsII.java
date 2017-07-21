/**
 * 
 */
package medium;

/**
 * @author duanc
 *
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row + 1][col + 1];
        if (obstacleGrid[0][0] == 0) {
        	dp[1][1] = 1;
        } else {
        	dp[1][1] = 0;
        }
        
        for (int i = 0; i < row; ++i) {
        	for (int j = 0; j < col; ++j) {
        		if (i == 0 && j == 0) {
        			continue;
        		}
        		if (obstacleGrid[i][j] == 1) {
        			dp[i + 1][j + 1] = 0;
        		} else {
        			dp[i + 1][j + 1] = dp[i + 1][j] + dp[i][j + 1];
        		}
        		
        	}
        }
        return dp[row][col];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
