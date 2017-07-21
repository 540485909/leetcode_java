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
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> result = new ArrayList<List<Integer> >();
        if (n <= 0 || k <= 0) {
        	return result;
        }
        List<Integer> cur = new ArrayList<Integer>();
        helper(result, cur, n, 1, k);
        return result;
        
        
    }
    public void helper(List<List<Integer>> result, List<Integer> cur, int n, int pos, int k) {
    	if (k == 0) {
    		result.add(new ArrayList<Integer>(cur));
    		return;
    	}
    	if (pos > n) {
    		return;
    	}
    	for (int i = pos; i <= n; ++i) {
    		cur.add(i);
    		helper(result, cur,n, i + 1, k - 1);
    		cur.remove(cur.size() - 1);
    	}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combinations cbt = new Combinations();
		System.out.print(cbt.combine(4, 2).toString());
	}

}
