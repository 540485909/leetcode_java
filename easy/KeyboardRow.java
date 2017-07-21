/**
 * 
 */
package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author duanc
 *
 */
public class KeyboardRow {
	 public String[] findWords(String[] words) {
		 String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
		 Map<Character, Integer> mp = new HashMap<Character, Integer>();
		 for (int i = 0; i < strs.length; ++i) {
			 for (char c : strs[i].toCharArray()) {
				 mp.put(c, i);
			 }
		 }
		 List<String> result = new ArrayList<String>();
		 for (int i = 0; i < words.length; ++i) {
			 if (words[i].equals("")) {
				 continue;
			 }
			 int index = mp.get(words[i].toUpperCase().charAt(0));
			 for (char c : words[i].toUpperCase().toCharArray()) {
				 if (mp.get(c) != index) {
					 index = -1;
					 break;
				 }
			 }
			 if (index != -1) {
				 result.add(words[i]);
			 }
		 }
		 return result.toArray(new String[0]);
	       
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] words = {"Hello","Alaska","Dad","Peace"};
        KeyboardRow kbr = new KeyboardRow();
        System.out.println(kbr.findWords(words));
        
	}

}
