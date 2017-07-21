/**
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.TreeNode;

/**
 * @author duanc
 *
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
        	return result;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
        	int len = queue.size();
        	List<Integer> levelResult = new ArrayList<Integer>();
        	for (int i = 0; i < len; ++i) {
        		
        		TreeNode cur = queue.peek();
        		levelResult.add(new Integer(cur.val));
        		if (cur.left != null) {
        			queue.offer(cur.left);
        		}
        		if (cur.right != null) {
        			queue.offer(cur.right);
        		}
        	}
        	result.add(levelResult);
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
