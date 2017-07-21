/**
 * 
 */
package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author duanc
 *
 */
public class TargetSum {

    public int findTargetSumWays(int[] nums, int S) {
        Map<String, Integer> map = new HashMap<>();
        int result = dfs(nums, S, 0,map);
        return result;
    }
    private int dfs(int[] nums, int target, int pos, Map<String, Integer> map) {
    	String encoding = String.valueOf(pos) + "->" + String.valueOf(target);
    	if (map.containsKey(encoding)) {
    		return map.get(encoding);
    	}
    	if (pos == nums.length) {
    		if (target == 0) {
    			return 1;
    		} else {
    			return 0;
    		}
    	}
    	int add = dfs(nums, target - nums[pos], pos + 1, map);
    	int minus = dfs(nums, target + nums[pos], pos + 1, map);
    	map.put(encoding, add + minus);
    	return add + minus;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TargetSum ts = new TargetSum();
		System.out.println(ts.findTargetSumWays(new int[]{1,1,1,1,1}, 3));
	}

}
