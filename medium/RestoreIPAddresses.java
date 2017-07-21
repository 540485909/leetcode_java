/**
 * 
 */
package medium;

import java.util.List;

/**
 * @author duanc
 *
 */
public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        return null;
    }
    private void helper(List<StringBuilder> result, StringBuilder cur, String s, int pos, int k) {
    	if (s.length() - pos > (4 - k) * 3) {
    		return;
    	}
    	if (k == 0 && pos == s.length()) {
    		cur.delete(cur.length() - 1, cur.length());
    		result.add(new StringBuilder(cur));
    		return;
    		
    	}
    	int num = 0;
    	for (int i = pos; i < s.length() && i <= pos + 3; ++i) {
    		num = 10 * num + s.charAt(i) - '0';
    		if (num <= 255) {
    			cur.append(s.charAt(i));
    			cur.append(".");
    			helper(result, cur,s, i + 1, k - 1);
    			cur.delete(cur.length() - 2, cur.length());
    		} 
    		if (num == 0) {
    			break;
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
