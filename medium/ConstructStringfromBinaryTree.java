/**
 * 
 */
package medium;

import util.TreeNode;

/**
 * @author duanc
 *
 */
public class ConstructStringfromBinaryTree {
    public String tree2str(TreeNode t) {
    	if (t == null) {
    		return "";
    	}
    	String result = helper(t);
    	return result;
    	
    }
    private String helper(TreeNode t) {
    	if (t == null) {
    		return null;
    	}
        /* divide */
    	String left = helper(t.left);
    	String right = helper(t.right);
    	/* conquer */
    	String rootStr = String.valueOf(t.val);
    	if (left == null && right == null) {
    		return rootStr;
    	}
    	String newLeft = "", newRight = "";
    	
    	if (left == null && right != null) {
    		newLeft = "()";
    		newRight = "(" + right + ")";
    		return rootStr + newLeft + newRight;
    	}
    	
    	newLeft =  "(" + left + ")";
    	if (right != null) {
    		newRight = "(" + right + ")";
    	}
    	return rootStr + newLeft + newRight;
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		TreeNode leftLeft = new TreeNode(4);
		root.left = left;
		root.right = right;
		left.left = leftLeft;
		ConstructStringfromBinaryTree csft = new ConstructStringfromBinaryTree();
		System.out.println(csft.tree2str(root));
	}

}
