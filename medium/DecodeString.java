/**
 * 
 */
package medium;

import java.util.Stack;

/**
 * @author duanc
 *
 */
public class DecodeString {
	public String processBracket(Stack<Character> stk) {
		StringBuilder sb = new StringBuilder();
		while (!stk.isEmpty()) {
			char top = stk.peek();
			stk.pop();
			if (top == '[') {
				break;
			}
			sb.append(top);
		}
		sb.reverse();
		String number = "";
		while (!stk.isEmpty()) {
			char top = stk.peek();
			if (top < '0' || top > '9') {
				break;
			}
			stk.pop();
			number = top + number;
		}
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < Integer.parseInt(number); ++i) {
			result.append(sb);
		}
		return result.toString();
	}
    public String decodeString(String s) {
    	if (s == null || s.length() == 0) {
    		return "";
    	}
        Stack<Character> stk = new Stack<Character>();
        for (char c : s.toCharArray()) {
        	if (c == ']') {
        		String temp = processBracket(stk);
        		for (char tempc : temp.toCharArray()) {
        			stk.push(tempc);
        		}
        	} else {
        		stk.push(c);
        	}
        }
        StringBuffer result = new StringBuffer();
        for (char c : stk) {
        	result.append(c);
        }
        return result.toString();
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecodeString ds = new DecodeString();
		System.out.println(ds.decodeString("2a"));
	}

}
