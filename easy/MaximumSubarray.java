/**
 * 
 */
package easy;

/**
 * @author duanc
 *
 */
public class MaximumSubarray {
	
    public int maxSubArray(int[] nums) {
    	int localmax = 0;
    	int globalmax = Integer.MIN_VALUE;
    	for (int i : nums) {
    		localmax = Math.max(localmax + i, i);
    		globalmax = Math.max(globalmax, localmax);
    	}
        return globalmax;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
