/**
 * 
 */
package medium;

/**
 * @author duanc
 *
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int maxproduct = 1, minproduct = 1;
        int globalproduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) {
        	int temp = maxproduct;
        	maxproduct = Math.max(maxproduct * nums[i], 
        			Math.max(minproduct * nums[i], nums[i]));
        	minproduct = Math.min(minproduct * nums[i], Math.min(temp * nums[i], nums[i]));
        	globalproduct = Math.max(maxproduct, globalproduct);
        }
        return globalproduct;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
