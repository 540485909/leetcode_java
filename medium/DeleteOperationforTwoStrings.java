/**
 * 
 */
package medium;

/**
 * @author duanc
 *
 */
public class DeleteOperationforTwoStrings {
    public int minDistance(String word1, String word2) {
        if (word1 == null && word2 == null) {
        	return 0;
        } 
        if (word1 == null || word1.length() == 0) {
        	return word2.length();
        }
        if (word2 == null || word2.length() == 0) {
        	return word1.length();
        }
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; ++i) {
        	dp[i][0] = i;
        }
        for (int i = 0; i <= len2; ++i) {
    	   dp[0][i] = i;
        }
        for (int i = 0; i < len1; ++i) {
        	for (int j = 0; j < len2; ++j) {
        		if (word1.charAt(i) == word2.charAt(j)) {
        			dp[i + 1][j + 1] = dp[i][j];
        		}else {
        			dp[i + 1][j + 1] = Math.min(dp[i][j] + 2, 
        					Math.min(dp[i][j + 1] + 1, dp[i + 1][j] + 1));
        		}
        	}
        }
        return dp[len1][len2];
       
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
