/**
 * 
 */
package easy;

/**
 * @author duanc
 *
 */
public class NumberComplement {
	public int deleteZero(int num) {
		int index = 31;
		for (; index >= 0; index--) {
			if (((num >> index)&1) == 0) {
				continue;
			} else {
				return index;
			}
		}
		return index;
	}
	
    public int findComplement(int num) {
    	if (num == 0) {
    		return 1;
    	}
    	/**/
    	int i = 31;
    	for (; i >= 0; --i) {
    		if (((num >> i) & 1) == 1) {
    			break;
    		}
    	}
    	for (; i >= 0; --i) {
    		num = num ^ (1 << i);
    	}
    	return num;
       
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
