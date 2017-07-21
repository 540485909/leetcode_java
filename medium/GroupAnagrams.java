/**
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 * @author duanc
 *
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
        	return new ArrayList<List<String> > ();
        }
        HashMap<String, List<String> > map = new HashMap<String, List<String> >();
        for (String str : strs) {
        	char[] arr = str.toCharArray();
        	Arrays.sort(arr);
        	if (!map.containsKey(arr.toString())) {
        		map.put(arr.toString(), new ArrayList<String>());
        	} 
        	map.get(arr.toString()).add(str);
        }
        return new ArrayList<List<String> >(map.values());
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
