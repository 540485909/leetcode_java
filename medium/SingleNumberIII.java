/**
 * 
 */
package medium;

/**
 * @author duanc
 *
 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int xorResult = 0;
        for (int i : nums) {
        	xorResult ^= i;
        }
        int pos = getFirstOne(xorResult);
        int value1 = 0, value2 = 0;
        for (int i : nums) {
        	if ((i >> pos & 1) == 1) {
        		value1 ^= i;
        	} else {
        		value2 ^= i;
        	}
        }
        return new int[]{value1,value2};
    }
    private int getFirstOne(int value) {
    	for (int i = 0; i < value; ++i) {
    		if ((value >> i & 1) == 1) {
    			return i;
    		}
    	}
    	return -1;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
