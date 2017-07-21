/**
 * 
 */
package medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author duanc
 *
 */
class MyChar{
	char ch;
	int index;
	MyChar(char c, int i) {
		ch = c;
		index = i;
	}
}
public class IsSubsequence {
	public int binarySearch(MyChar[] mychars, char target) {
		int start = 0, end = mychars.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start)/2;
			if (mychars[mid].ch == target) {
				return mychars[mid].index;
			} else if(mychars[mid].ch > target) {
				end = mid;
			} else {
				start = mid;
			}
		}
		if (mychars[start].ch == target) {
			return mychars[start].index;
		}
		if (mychars[end].ch == target) {
			return mychars[end].index;
		}
		return -1;
	}
    public boolean isSubsequence(String s, String t) {
    	if (s == null || s.length() == 0) {
         	return true;
        }
        if (t == null || t.length() == 0) {
        	return false;
        } 
        MyChar[] mychars = new MyChar[t.length()];
        for(int i = 0; i < t.length(); ++i) {
        	mychars[i] = new MyChar(t.charAt(i), i);
        }
        Arrays.sort(mychars, new Comparator<MyChar>() {

			@Override
			public int compare(MyChar o1, MyChar o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.ch, o2.ch);
			}
        	
        });
        int prev = -1;
        for(int i = 0; i < s.length(); ++i) {
        	int cur = binarySearch(mychars, s.charAt(i));
        	if (cur == -1 || cur <= prev) {
        		prev = -1;
        		break;
        	} else {
        		prev = cur;
        	}
        }
        if (prev != -1) {
        	return true;
        } else {
        	return false;
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abc";
		String t = "ahbgdc";
		IsSubsequence is = new IsSubsequence();
		is.isSubsequence(s, t);
	}

}
