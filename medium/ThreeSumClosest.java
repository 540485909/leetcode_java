/**
 * 
 */
package medium;

import java.util.Arrays;

/**
 * @author duanc
 *
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
        	return -1;
        }
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; ++i) {
        	int left = i + 1, right = nums.length - 1;
        	while (left < right) {
        		int sum = nums[i] + nums[left] + nums[right];
        		if (diff > Math.abs(sum - target)) {
        			diff = Math.abs(sum - target);
        			result = sum;
        		}
        		if (sum > target) {
        			right--;
        		}else if (sum < target) {
        			left++;
        		}else {
        			return sum;
        		}
        		
        	}
       
        }
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSumClosest tsc = new ThreeSumClosest();
		System.out.print(tsc.threeSumClosest(new int[]{1,1 ,-1, -1,3}, -1));
	}

}
