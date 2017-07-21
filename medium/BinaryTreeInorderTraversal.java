package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import util.TreeNode;

public class BinaryTreeInorderTraversal {
	   public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> result = new ArrayList<Integer>();
	        Stack<TreeNode> stack = new  Stack<TreeNode>();
	        TreeNode p = root;
	        while (!stack.empty() || p != null) {
	        	if (p != null) {
	        		stack.push(p);
	        		p = p.left;
	        	} else {
	        		TreeNode top = stack.peek();
	        		result.add(top.val);
	        		stack.pop();
	        		p = top.right;
	        	}
	        }
	        return result;
	    }
}
