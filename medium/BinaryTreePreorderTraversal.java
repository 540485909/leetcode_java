package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import util.TreeNode;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode p = root;
        while (!stk.isEmpty() || p != null) {
        	if (p != null) {
        		stk.push(p);
        		result.add(p.val);
        		p = p.left;
        	} else {
        		TreeNode top = stk.peek();
        		stk.pop();
        		p = top.right;
        	}
        }
        return result;
    }
}
