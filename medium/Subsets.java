/**
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duanc
 *
 */
public class Subsets {
    public List<List<Integer> > subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        //helper(result, cur, nums, 0);
        for (int i = 0; i < (1 << nums.length); ++i) {
        	List<Integer> cur = new ArrayList<Integer>();
        	for (int j = 0; j < nums.length; ++j) {
        		if ((i >> j & 1) == 1) {
        			cur.add(nums[j]);
        		}
        	}
        	
        	result.add(new ArrayList<Integer>(cur));
        	cur.clear();
        	
        }
        return result;
    }
    void helper(List<List<Integer>> result, List<Integer> cur, int[] nums, int pos) {
    	result.add(new ArrayList<Integer>(cur));
    	for (int i = pos; i < nums.length; ++i) {
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
		Subsets s = new Subsets();
		int [] nums = {1, 2, 3};
		System.out.println(s.subsets(nums).toString());
	}

}
