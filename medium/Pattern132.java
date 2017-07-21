/**
 * 
 */
package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author duanc
 *
 */
public class Pattern132 {
	public int BigValue(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start)/2;
			if (nums[mid] < target) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if (nums[start] > target) {
			return start;
		} else if (nums[end] > target){
			return end;
		}
		return 0;
	}
	public int smallValue(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start)/2;
			if (nums[mid] > target) {
				end = mid;
			} else {
				start = mid;
			}
		}
		if (nums[end] < target){
			return end;
		} else if (nums[start] <target) {
			return start;
		}
		return 0;
	}
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
        	return false;
        }
        int[] sortedNums = new int[nums.length];
        sortedNums = nums.clone();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
        	map.put(nums[i], i);
        }
        Arrays.sort(sortedNums);
        for (int i = 0; i < nums.length; ++i) {
        	for (int j = i + 1; j < nums.length; ++j) {
        		/*biger than target*/
        		int lower = BigValue(sortedNums,nums[i]);
        		/*small than target*/
        		int upper = smallValue(sortedNums, nums[j]);
        		for (int k = lower; k + 1 < upper; ++k) {
        			if (map.get(sortedNums[k]) > j) {
        				return true;
        			}
        		}
        	}
        }
        return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1, 3, 2, 0};
		Pattern132 p = new Pattern132();
		System.out.println(p.find132pattern(nums));
	}

}
