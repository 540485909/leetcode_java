/**
 * 
 */
package medium;

import easy.SingleNumber;

/**
 * @author duanc
 *
 */
public class SingleNumberII {
	 public int singleNumber(int[] nums) {
	    /*three times we need two bits
	     * posOne, posTwo, and we need mask to reset one when we encounter k
	     * */

		    int one = 0, two = 0, mask = 0;
		    for (int i : nums) {
		    	//al the bit less than cur pos equals to 1
		    	// xm = (xm-1 & xm-2 ... & x2 & x1 & i)
		    	two = two ^ (one & i);
		    	one = one ^ i;
		    	
		    	//mask to reset for k if kj = 1 yj = xj 
		    	// here three means 11 so (one & two)
		    	mask = ~(one & two);
		    	one = mask & one;
		    	two = mask & two;
		    }
		    
		    return (one | two);
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNumberII sn = new SingleNumberII();
		System.out.println(sn.singleNumber(new int[]{1,3,3,3}));
	}

}
