/**
 * 
 */
package easy;

/**
 * @author duanc
 *
 */
public class NthDigit {
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;
        while ( n > len * count) {
        	n -= len * count;
        	len += 1;
        	count = 10 * count;
        	start = 10 * start;
        }
        start += (n  - 1) / len;
        String digit = String.valueOf(start);
        return digit.charAt((n - 1) % len);
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
