/**
 * 
 */
package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author duanc
 *
 */
public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 ||
        		nums2 == null || nums2.length ==  0) {
        	return new int[]{};
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
        	set.add(i);
        }
        HashSet<Integer> interset = new HashSet<>();
        for (int i : nums2) {
        	if (set.contains(i)) {
        		interset.add(i);
        	}
        }
        int [] result = new int[set.size()];
        int index = 0;
        for (int i : set) {
        	result[index++] = i;
        }
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
