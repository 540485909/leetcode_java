/**
 * 
 */
package easy;

/**
 * @author duanc
 *
 */
public class ReverseBits {
    public int reverseBits(int n) {
    	int result = 0;
        for (int i = 0; i < 32; ++i) {
        	int bitValue = (n >> i) & 1;
        	result += bitValue << (31 - i);
        }
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseBits rb = new ReverseBits();
		rb.reverseBits(2);
	}

}
