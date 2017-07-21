/**
 * 
 */
package hard;

import java.util.Arrays;

/**
 * @author duanc
 *
 */
public class PalindromePartitioningII {
    public int minCut(String s) {
        /*p[i][j] means from i to j is palindrome
         * cut[i] means minimum cut
         * 
         * */
    	boolean[][] p = new boolean[s.length() + 1][s.length() + 1];
    	for (int i = s.length() - 1; i >= 0; --i) {
    		p[i][i] = true;
    		for (int j = i + 1; j < s.length(); ++j) {
    			if (s.charAt(i) == s.charAt(j)) {
    				p[i][j] = j - 1 < i + 1 ? true : p[i + 1][j - 1] ;
    			}
    		}
    	}
    	int[] cut = new int[s.length() + 1];
    	Arrays.fill(cut, Integer.MAX_VALUE - 2);
    	cut[s.length()] = 0;
    	for (int i = s.length() - 1; i >= 0; --i) {
    		for (int j = i; j < s.length(); ++j) {
    			
    			if (p[i][j] == true) {
    				cut[i] = Math.min(cut[i], cut[j + 1] + 1);
    			}
    		}
    	}
    	return cut[0] - 1;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromePartitioningII pp = new PalindromePartitioningII();
		pp.minCut("aa");
	}

}
