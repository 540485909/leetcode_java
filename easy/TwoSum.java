/**
 * 
 */
package easy;

import java.util.Arrays;

/**
 * @author duanc
 *
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
        	return new int[]{};
        }
        int[] result = new int[2];
        Arrays.sort(numbers);
        int left = 0, right = numbers.length - 1;
        while (left < right) {
        	int sum = numbers[left] + numbers[right];
        	if (sum == target) {
        		result[0] = left;
        		result[1] = right;
        		return result;
        	} else if (sum < target) {
        		left++;
        	} else {
        		right--;
        	}
        }
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
