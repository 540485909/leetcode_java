/**
 * 
 */
package medium;

/**
 * @author duanc
 *
 */
public class UglyNumberII {
    public int nthUglyNumber(int n) {
    	if (n <= 1) {
    		return 1;
    	}
        int id2 = 0, id3 = 0, id5 = 0;
        int [] res = new int[n + 1];
        res[0] = 1;
        int index = 0;
        while (index < n) {
        	int number2 = res[id2] * 2;
        	int number3 = res[id3] * 3;
        	int number5 = res[id5] * 5;
        	int next = Math.min(number2, Math.min(number3, number5));
        	
        	if (next == number2) {
        		id2++;
        	} else if (next == number3) {
        		id3++;
        	} else if (next == number5) {
        		id5++;
        	}
        	if (next != res[index]) {
        		res[++index] = next;
        	}
        }
        return res[n - 1];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UglyNumberII un = new UglyNumberII();
		System.out.print(un.nthUglyNumber(10));
	}

}
