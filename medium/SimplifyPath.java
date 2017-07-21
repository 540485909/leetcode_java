/**
 * 
 */
package medium;

import java.util.Stack;

/**
 * @author duanc
 *
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
    	/*"/a/./b/../../c/" */
        if (path == null || path.length() == 0) {
        	return path;
        }
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < path.length(); ) {
        	++i; // ship /
        	String dir = "";
        	int j = path.indexOf('/',i);
        	if (j < 0) {
        		j = path.length();
        	}
        	dir = path.substring(i, j);
        	if (!dir.isEmpty() && !dir.equals(".")) {
        		if (dir.equals("..")) {
        			if (!stack.isEmpty()) {
        				stack.pop();
        			}
        		} else {
        			stack.push(dir);
        		}
        	}
        	i = j;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
        	String temp = "/" + stack.peek();
        	stack.pop();
        	sb.insert(0, temp);
        }
        return sb.toString();
        
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplifyPath sp = new SimplifyPath();
		sp.simplifyPath("/a/./b/../../c");
	}

}
