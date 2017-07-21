/**
 * 
 */
package easy;

/**
 * @author duanc
 *
 */
public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        return Math.log10(n)/Math.log10(3) % 1 == 0;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
