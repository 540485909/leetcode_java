/**
 * 
 */
package medium;

/**
 * @author duanc
 *
 */
public class MaximumProductofWordLengths {
    public int maxProduct(String[] words) {
    	int len = words.length;
    	int[] nums = new int[len];
        for (int i = 0; i < len; ++i) {
        	for (int j = 0; j < words[i].length(); ++j) {
        		nums[i] |= (1 << words[i].charAt(j) - 'a');
        	}
        }
        int maxproduct = 0;
    	for (int i = 0; i < len; ++i) {
    		for (int j = i + 1; j < len; ++j) {
    			int product = words[i].length() * words[j].length();
    			if ((nums[i] & nums[j]) == 0) {
    				maxproduct = Math.max(maxproduct, product);
    			}
    		}
    	}
    	return maxproduct;
    		
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
