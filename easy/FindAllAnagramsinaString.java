/**
 * 
 */
package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author duanc
 *
 */
public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        
    	List<Integer> result = new ArrayList<>();
    	if (s == null || p == null | s.length() == 0 || p.length() == 0) {
    		return result;
    	}
    	int[] hash = new int[256];
    	for (int i : p.toCharArray()) {
    		hash[i]++;
    	}
    	int left = 0, right = 0, count = p.length();
    	/*every time select three */
    	while (left < right) {
    		if (hash[s.charAt(right) - 'a']-- > 0) {
    			right++;
    			count--;
    		}
    		if (count == 0) {
    			result.add(left);
    		}
    		if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) {
    			count++;
    		}
    	}
    	return result;
    }
    private boolean isAnagram(String s, String p) {
    	int[] map = new int[26];
    	for (char c : p.toCharArray()) {
    		map[c - 'a']++;
    	}
    	for (char c : s.toCharArray()) {
    		map[c - 'a']--;
    	}
    	for (int i = 0; i < 26; ++i) {
    		if (map[i] != 0) {
    			return false;
    		}
    	}
    	return true;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAllAnagramsinaString fas  = new FindAllAnagramsinaString();
		fas.findAnagrams("ababababab", "aab");
	}

}
