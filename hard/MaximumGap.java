/**
 * 
 */
package hard;

import util.Bucketsort;
import util.Radixsort;

/**
 * @author duanc
 *
 */
public class MaximumGap {
    public int maximumGap(int[] nums) {
        if (nums.length <= 1) {
        	return 0;
        }
        //Bucketsort.bucketsort(nums);
        Radixsort.radixsort(nums);
        int maxDiff = 0;
        for (int i  = 1; i < nums.length; ++i) {
        	maxDiff = Math.max(maxDiff, nums[i] - nums[i - 1]);
        }
        return maxDiff;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumGap mg = new MaximumGap();
		System.out.println(mg.maximumGap(new int[]{100, 1,2,4, 987}));
	}

}
