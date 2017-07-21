/**
 * 
 */
package hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import util.TreeNode;
import util.Util;

/**
 * @author duanc
 *
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while (!stack.empty() || p != null) {
        	if (p != null) {
        		stack.push(p);
        		result.add(p.val);
        		p = p.right;
        	} else {
        		TreeNode top = stack.peek();
        		stack.pop();
        		p = top.left;
        	}
        }
        Collections.reverse(result);
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
