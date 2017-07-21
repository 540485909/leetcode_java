/**
 * 
 */
package medium;

/**
 * @author duanc
 *
 */
public class ReverseWordsinaString {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
        	return s;
        }
        StringBuilder sb = new StringBuilder(s.trim());
        sb = sb.reverse();
        String[] strs = sb.toString().split(" ");
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
        	if (str.equals("")) {
        		continue;
        	}
        	StringBuilder temp = new StringBuilder(str);
        	result.append(temp.reverse() + " ");
        	
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsinaString rws = new ReverseWordsinaString();
		System.out.println(rws.reverseWords("   a    b  "));
	}

}
