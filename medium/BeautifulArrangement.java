/**
 * 
 */
package medium;

/**
 * @author duanc
 *
 */
public class BeautifulArrangement {
	private int count = 0;
    public int countArrangement(int N) {
    	if (N == 0) {
    		return 0;
    	}
        helper(new int[N], 0, N);
        return count;
    }
    public void helper(int[] used, int pos, int N) {
    	if (pos == used.length) {
    		count++;
    		return;
    	}
    	for (int i = 1; i <= N; ++i) {
    		if (used[i] == 0 && (i % pos == 0 || pos % i == 0)) {
    			used[i] = 1;
    			helper(used, pos + 1, N);
    			used[i] = 0;
    		}
    	}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
