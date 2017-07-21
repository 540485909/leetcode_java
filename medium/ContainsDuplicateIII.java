package medium;

import java.util.TreeSet;

public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    	if (k < 0 || t < 0) {
    		return false;
    	}
    	TreeSet<Integer> set = new TreeSet<>();
    	for (int i = 0; i < nums.length; ++i) {
    		if (i > k) {
    			set.remove(nums[i - k]);
    		}
    		//*return value less than or equal to x
    		Integer floor = set.floor(nums[i] + t);
    		//return values greater than or equal to x
    		Integer ceil = set.ceiling(nums[i] - t);
    		if (floor != null )
    		floor = 0;
    	}
    	return false;
    }
    public static void main(String [] args) {
    	ContainsDuplicateIII cd = new ContainsDuplicateIII();
    	
    	cd.containsNearbyAlmostDuplicate(new int[]{1,0,1,1},1, 0);
    }
}
