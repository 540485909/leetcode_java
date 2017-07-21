/**
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author duanc
 *
 */
public class ComposeMaximal {
	public String compose(int [] nums) {
		List<String> strs = new ArrayList<String>();
		for (int i = 0; i < nums.length; ++i) {
			strs.add(String.valueOf(nums[i]));
		}
		Collections.sort(strs, new Comparator<String>(){
			@Override
			public int compare(String a, String b) {
				String left = a + b;
				String right = b + a;
				return right.compareTo(left);
			}
		});
		StringBuffer strBuff = new StringBuffer();
		for (String str : strs) {
			strBuff.append(str);
		}
		return strBuff.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {9,3, 24, 30};
		ComposeMaximal cm = new ComposeMaximal();
		System.out.println(cm.compose(nums));
	}

}
