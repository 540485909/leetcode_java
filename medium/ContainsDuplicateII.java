package medium;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length <= 1 || k <= 0) {
        	return false;
        }
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
        	if (hashMap.containsKey(nums[i])) {
        		int index = hashMap.get(nums[i]);
        		if (i - index <= k) {
        			return true;
        		}
        	}
        	hashMap.put(nums[i], i);
        }
        return false;
    }
}
