/**
 * 
 */
package easy;

import util.Util;

/**
 * @author duanc
 *
 */
public class ThirdMaximumNumber {
	/*bubble sort*/
    public int thirdMax(int[] nums) {
    	int k = 2;
    	int cnt = 0;
        for (int i = 0; i < nums.length && k > 0; ++i) {
        	for (int j = nums.length - 1; j > i; --j) {
        		if (nums[j] > nums[j - 1]) {
        			Util.swap(nums, j, j -1);
        		}
        	}
        	/* not duplicate k--*/
        	if (i != 0 && nums[i] != nums[i - 1]) {
        		k--;
        	}
        	cnt++;
        }
        if (k > 0) {
        	return nums[0];
        } else {
        	return nums[cnt - 1];
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
