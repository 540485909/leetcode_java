/**
 * 
 */
package easy;

/**
 * @author duanc
 *
 */
public class ValidWordAbbreviation {
    public boolean validWordAbbreviation(String word, String abbr) {
        if (word == null && abbr == null) {
        	return true;
        }
        if (word == null && abbr != null) {
        	return false;
        }
        int lena = word.length(), lenb = abbr.length();
        int i = 0, j = 0;
        while ( i < lena && j < lenb) {
        	if (Character.isLetter(abbr.charAt(j))) {
        		if (abbr.charAt(j) != word.charAt(i)) {
        			return false;
        		}
        		i++;
        		j++;
        	} else if (abbr.charAt(i) > '0' && abbr.charAt(j) <= '9'){
        		int num = 0;
            	while (Character.isDigit(abbr.charAt(j))) {
            		num = 10 * num + abbr.charAt(j) - '0';
            		j++;
            	}
            	i = i + num;
        	} else {
        		return false;
        	}
        	
        	
        	
        }
        if (i == lena && j == lenb) {
        	return true;
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
