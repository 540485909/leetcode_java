/**
 * 
 */
package easy;

/**
 * @author duanc
 *
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
    	int k = s.length();
        int seg = 2;
        while (seg <= k) {
        	if (k % seg != 0) {
        		seg++;
        		continue;
        	}
        	String str = s.substring(0, k/seg);
        	StringBuilder sb = new StringBuilder();
        	for (int i = 0; i < seg; ++i) {
        		sb.append(str);
        	}
        	if (sb.toString().equals(s)) {
        		return true;
        	}
        	seg++;
        }
        return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedSubstringPattern rsp = new RepeatedSubstringPattern();
		rsp.repeatedSubstringPattern("aba");
	}

}
