/**
 * 
 */
package hard;

import java.util.Arrays;

/**
 * @author duanc
 *
 */
public class ScrambleString {
    public boolean isScramble(String s1, String s2) {
        if (s1.equals(s2)) {
        	return true;
        }
        int len = s1.length();
        int[] count = new int[26];
        Arrays.fill(count, 0);
        for (char c : s1.toCharArray()) {
        	count[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
        	count[c - 'a']--;
        }
        for (char c : s1.toCharArray()) {
        	if (count[c - 'a'] != 0) {
        		return false;
        	}
        }
        for (int i = 1; i <= len - 1; ++i) {
        	if (isScramble(s1.substring(0, i), s2.substring(0, i)) 
        			&& isScramble(s1.substring(i), s2.substring(i))) {
        		return true;
        	}
        	if (isScramble(s1.substring(0,i), s2.substring(len - i))
        			&& isScramble(s1.substring(i), s2.substring(0, len - i))){
        		return true;
        	}
        }
        return false;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
