/**
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author duanc
 *
 */
public class FindKPairswithSmallestSums {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    	List<int[]> result = new ArrayList<int[]>();
        if (nums1 == null || nums2 == null 
        		|| nums1.length == 0 || nums2.length == 0 ) {
        	return result;
        }
        for (int i = 0; i < nums1.length; ++i) {
        	for (int j = 0; j < nums2.length; ++j) {
        		result.add(new int[]{nums1[i], nums2[j]});
        	}
        }
        Collections.sort(result, new Comparator<int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1[0] + o1[1], o2[0] + o2[1]);
			}
        	
        });
        while (true) {
        	if (result.size() > k) {
        		result.remove(result.size() - 1);
        	} else {
        		break;
        	}
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
