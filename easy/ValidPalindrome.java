/**
 * 
 */
package easy;

/**
 * @author duanc
 *
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
        	if (!Character.isLetterOrDigit(s.charAt(left))) {
        		left++;
        	} else if (!Character.isLetterOrDigit(s.charAt(right))) {
        		right--;
        	} else if (s.charAt(left) != s.charAt(right)) {
        		return false;
        	} else {
        		left++;
        		right--;
        	}
        
        }
    	return true;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome vp = new ValidPalindrome();
		vp.isPalindrome("aA");
	}

}
