/**
 * 
 */
package medium;

/**
 * @author duanc
 *
 */
public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        int [] dp = new int[target + 2];
        dp[0] = 1;
        for (int i = 1; i <= target; ++i) {
        	for (int j = 0; j < nums.length; ++j) {
        		if (i >= nums[j]) {
        			dp[i] = dp[i] + dp[i - nums[j]];
        		}
        		
        	}
        }
        return dp[target];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationSumIV cs = new CombinationSumIV();
		System.out.println(cs.combinationSum4(new int[]{1,2,3}, 4));
	}

}
