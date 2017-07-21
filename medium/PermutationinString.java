/**
 * 
 */
package medium;



/**
 * @author duanc
 *
 */
public class PermutationinString {

    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null) {
        	return false;
        }
        if (s1.length() > s2.length()) {
        	return false;
        }
        int [] map = new int[256];
        for (char c : s1.toCharArray()) {
        	map[c]++;
        }
        int left = 0, right = 0;
        int cnt = s1.length();
        while (right < s2.length()) {
        	if (--map[s2.charAt(right++)] <= 0) {
        		cnt--;
        	}
        	while (cnt == 0) {
        		if (right - left == s1.length()) return true;
        		if (++map[s2.charAt(left++)] > 0) {
        			cnt++;
        		}
        		
        	}
        }
		return false;
       
        //return substr(sorted2, sorted1);
        
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ab";
		String s2 = "ab";
		PermutationinString ps = new PermutationinString();
		ps.checkInclusion(s1, s2);
	}

}
