/**
 * 
 */
package medium;

import java.util.Arrays;

/**
 * @author duanc
 *
 */
public class LongestIncreasingSubsequence {
	private int lowerBound(int[] nums, int x) {
		int left = 0, right = nums.length - 1;
		while (left  + 1 < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] >= x) {
				right = mid;
			} else {
				left = mid;
			}
		}
		if (nums[right] < x) {
			return right + 1;
		}
		if (nums[right] == x || nums[left] < x) {
			return right;
		}
		return left;
	}
	public int lengthOfLIS(int[] nums) {
	     int[] dp = new int[nums.length + 1];
	     Arrays.fill(dp, Integer.MAX_VALUE - 2);
	     for (int x : nums) {
	    	 int pos = lowerBound(dp, x);
	    	 dp[pos] = x;
	     }
	     for (int i = 0; i < dp.length; ++i) {
	    	 if (dp[i] == Integer.MAX_VALUE - 2) {
	    		 return i;
	    	 }
	     }
	     return 0;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestIncreasingSubsequence lii = new LongestIncreasingSubsequence();
		lii.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});
	}

}
