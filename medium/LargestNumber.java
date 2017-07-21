/**
 * 
 */
package medium;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author duanc
 *
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        int len = nums.length;
        String[] strs = new String[len];
        for (int i = 0; i < len; ++i) {
        	strs[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(strs, (String s1, String s2) -> {
        	String leftRight = s1 + s2;
        	String rightLeft = s2 + s1;
        	return leftRight.compareTo(rightLeft);
        });
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
        	sb.append(s);
        }
        while (sb.charAt(0) == '0' && sb.length() > 1) {
        	sb.deleteCharAt(0);
        }
        return sb.toString();
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
