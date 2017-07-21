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
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer> > result = new ArrayList<List<Integer> >();
        List<Integer> cur = new ArrayList<>();
        helper(result, cur, candidates, 0, target);
        return result;
    }
    private void helper(List<List<Integer> > result, List<Integer> cur, 
    		int[] candidates, int pos,  int target) {
    	if ( target < 0) {
    		return;
    	}
    	if (target == 0) {
    		result.add(new ArrayList<>(cur));
    		return;
    	}
    	for (int i = pos; i < candidates.length; ++i) {
    		if (i != pos && candidates[i] == candidates[ i - 1]) {
    			continue;
    		}
    		cur.add(candidates[i]);
    		helper(result, cur, candidates, i + 1, target- candidates[i]);
    		cur.remove(cur.size() - 1);
    	}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationSumII cs = new CombinationSumII();
		System.out.print(cs.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
	}

}
