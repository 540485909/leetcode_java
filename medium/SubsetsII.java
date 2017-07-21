/**
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author duanc
 *
 */
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer> > result = new ArrayList<List<Integer> >();
        if (nums == null || nums.length == 0) {
        	return result;
        }
        List<Integer> cur = new ArrayList<Integer>();
        Arrays.sort(nums);
        helper(result, cur, nums, 0);
        return result;
    }
    private void helper(List<List<Integer> > result, List<Integer> cur, int[] nums, int pos) {
    	result.add(new ArrayList<Integer>(cur));
    	for (int i = pos; i < nums.length; ++i) {
    		if (i != pos && (nums[i] == nums[i - 1] || nums[i] == nums[pos])) {
    			continue;
    		}
    		cur.add(nums[i]);
        	helper(result, cur, nums, i + 1);
        	cur.remove(cur.size() - 1);
    		
    		
    	}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubsetsII ss = new SubsetsII();
		System.out.println(ss.subsetsWithDup(new int[]{1,1,2}).toString());
	}

}
