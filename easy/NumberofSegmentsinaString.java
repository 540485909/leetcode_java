/**
 * 
 */
package easy;

/**
 * @author duanc
 *
 */
public class NumberofSegmentsinaString {
    public int countSegments(String s) {
        if (s == null || s.length() == 0) {
        	return 0;
        }
        s = s.trim();
        if (s.length() == 0) {
        	return 0;
        }
        String[] strs = s.split(" ");
        return strs.length;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "         ";
		NumberofSegmentsinaString nss = new NumberofSegmentsinaString();
		nss.countSegments(s);

	}

}
