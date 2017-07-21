/**
 * 
 */
package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author duanc
 *
 */
public class WordBreakII {
    public List<String> wordBreak(String s, List<String> wordDict) {
    	Set<String> wordSet = new HashSet<String>();
    	for (String word : wordDict) {
    		wordSet.add(word);
    	}
		//return dfs(s, wordSet, new HashMap<String, LinkedList<String>>());*/
    	boolean [][] path = new boolean[s.length() + 1][s.length() + 1];
    	boolean [] dp = new boolean[s.length() + 1];
    	dp[0] = true;
    	for (int i = 1; i <= s.length(); ++i) {
    		for (int j = i - 1;  j >= 0; --j) {
    			if (dp[j] && wordSet.contains(s.substring(j, i))) {
    				wordSet.remove(s.substring(j, i));
    				path[j][i] = true;
    				dp[i] = true;
    			}
    		}
    	}
        List<String> result = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        generatePath(result, cur, s, path, 0);
        return result;
    }
    public void generatePath(List<String> result, StringBuilder cur, String s, boolean [][] path, int pos) {
    	if (pos == s.length()) {
    		result.add(new String(cur));
    		return;
    	}
    	for (int i = pos; i <= s.length(); ++i) {
    		if (path[pos][i] == true) {
    			int size = cur.length();
    			cur.append(s.substring(pos, i) + " ");
    			generatePath(result, cur, s, path, i);
    			cur.delete(size, cur.length());
    		}
    	}
    	
    }
	public List<String> dfs(String s, Set<String> wordDict, HashMap<String, LinkedList<String>> map) {
		if (map.containsKey(s)) {
			return map.get(s);
		}
		LinkedList<String> res = new LinkedList<String>();
		if (s.length() == 0) {
			res.add("");
			return res;
		}
		for (String word: wordDict) {
			if (s.startsWith(word)) {
				List<String> sublist = dfs(s.substring(word.length()), wordDict, map);
				for (String sub : sublist) {
					res.add(word + (sub.isEmpty() ? "" : " ") + sub);
				}
			}
		}
		map.put(s,  res);
		return res;
	       
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordBreakII wb = new WordBreakII();
		List<String> wordDict = new ArrayList<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
		String s = "catsanddog";
		wb.wordBreak(s, wordDict);
	}

}
