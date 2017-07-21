package medium;

import util.TreeNode;

public class FlattenBinaryTreetoLinkedList {
    public void flatten(TreeNode root) {
        helper(root);
    }
    public TreeNode helper(TreeNode root) {
    	if (root == null) {
    		return null;
    	}
    	TreeNode left = helper(root.left);
    	TreeNode right = helper(root.right);
    	if (left == null) {
    		return root;
    	}
    	root.left = null;
    	root.right = left;
    	TreeNode leftMost = left;
    	while ( leftMost.right != null) {
    		leftMost = leftMost.right;
    	}
    	
    	leftMost.right = right;
    	
    	
    	return root;
    }
}
