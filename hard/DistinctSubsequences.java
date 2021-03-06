/**
 * 
 */
package hard;

/**
 * @author duanc
 *
 */
public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
    	if ( t == null) {
    		return 1;
    	}
        if (s == null || s.length() < t.length()) {
        	return 0;
        }
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < s.length(); ++i) {
        	dp[i][0] = 1;
        }
        for (int i = 1; i <= s.length(); ++i) {
        	for (int j = 1; j <= t.length(); ++j) {
        		if (s.charAt(i - 1) == t.charAt(j - 1)) {
        			dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
        		} else {
        			dp[i][j] = dp[i - 1][j];
        		}
        	}
        }
        return dp[s.length()][t.length()];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistinctSubsequences ds = new DistinctSubsequences();
		System.out.println(ds.numDistinct("rabbbit", "rabbit"));
	}

}
