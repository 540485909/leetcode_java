/**
 * 
 */
package hard;

import util.TreeNode;

/**
 * @author duanc
 *
 */
public class SerializeandDeserializeBinaryTree {

	    // Encodes a tree to a single string.
	    public String serialize(TreeNode root) {
	        if (root ==  null) {
	        	return "#";
	        }
	        return String.valueOf(root.val)+","+serialize(root.left) +","+ serialize(root.right);
	    }

	    // Decodes your encoded data to tree.
	    public TreeNode deserialize(String data) {
	    	StringBuilder sb = new StringBuilder(data);
	        return createTree(sb);
	    }
	    public TreeNode createTree(StringBuilder data) {
	        if (data.length() <= 0) {
	        	return null;
	        }
	        if (data.charAt(0) == '#') {
	        	if (data.length() > 1) {
	        		 data.delete(0, 2);
	        	} 
	        	return null;
	        }
	    	int index = data.indexOf(",");
	    	int val = Integer.parseInt(data.substring(0, index));
	    	data.delete(0, index + 1);
	    	TreeNode root = new TreeNode(val);
	    	root.left = createTree(data);
	    	root.right = createTree(data);
	    	return root;
	    }
	    

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		TreeNode rightleft = new TreeNode(4);
		TreeNode rightright = new TreeNode(5);
		root.left = left;
		root.right = right;
		right.left = rightleft;
		right.right = rightright;
		SerializeandDeserializeBinaryTree tr = new SerializeandDeserializeBinaryTree();
		tr.deserialize(tr.serialize(root));
	   

	}

}
