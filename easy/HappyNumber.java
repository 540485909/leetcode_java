/**
 * 
 */
package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author duanc
 *
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
        	int sum = getDigitSquare(n);
        	if (sum == 1) {
        		return true;
        	}
        	if (set.contains(sum) == true) {
        		return false;
        	} 
        	set.add(sum);
        	n = sum;
        }
    }
    private int getDigitSquare(int n) {
    	List<Integer> digits = new ArrayList<>();
    	while (n != 0) {
    		digits.add(n % 10);
    		n = n / 10;
    	}
    	int sum = 0;
    	for (int i : digits) {
    		sum += i * i;
    	}
    	return sum;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyNumber hn = new HappyNumber();
		System.out.println(hn.isHappy(19));
	}

}
