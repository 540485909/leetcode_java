/**
 * 
 */
package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author duanc
 *
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
        	return true;
        }
        Set<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
        	if (hashSet.contains(i)) {
        		return true;
        	} else {
        		hashSet.add(i);
        	}
        }
        return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
