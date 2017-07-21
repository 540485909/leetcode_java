/**
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.TreeNode;


/**
 * @author duanc
 *
 */
public class MostFrequentSubtreeSum {
	private Map<Integer, Integer> map;
	private int maxCount = Integer.MIN_VALUE;
	public TreeNode helper(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode left = helper(root.left);
		TreeNode right = helper(root.right);
		if (left != null) {
			root.val += left.val;
		}
		if (right != null) {
			root.val += right.val;
		}
		if (map.containsKey(root.val)) {
			map.put(root.val, map.get(root.val) + 1);
		} else {
			map.put(root.val, 1);
		}
		maxCount = Math.max(maxCount, map.get(root.val));
		return root;
	}
    public int[] findFrequentTreeSum(TreeNode root) {
    	maxCount = 0;
    	map = new HashMap<Integer, Integer>();
    	helper(root);
    	List<Integer> array = new ArrayList<Integer>();
    	for (int key : map.keySet()) {
    		if (map.get(key) == maxCount) {
    			array.add(key);
    		}
     	}
    	int[] result = new int[array.size()];
    	for (int i = 0; i < result.length; ++i) {
    		result[i] = array.get(i);
    	}
		return result;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
