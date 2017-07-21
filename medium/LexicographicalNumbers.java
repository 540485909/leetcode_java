/**
 * 
 */
package medium;

import java.util.*;

/**
 * @author duanc
 *
 */
public class LexicographicalNumbers {
	private List<Integer> result = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
       for (int i = 1; i < 10; ++i) {
    	   dfs(n, i);
       }
       return result;
    }
   
    private void dfs(int n, int cur) {
    	if (cur > n) {
    		return;
    	}
    	result.add(cur);
    	for (int i = 0; i <= 9; ++i) {
    		if (cur * 10 + i <= n) {
        	    dfs(n, cur * 10 + i);
    		}
    		
    	}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LexicographicalNumbers ln = new LexicographicalNumbers();
		ln.lexicalOrder(13);
	}

}
