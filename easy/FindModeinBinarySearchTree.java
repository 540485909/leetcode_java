package easy;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

public class FindModeinBinarySearchTree {
	private int cnt = 1;
	private int max = 0;
	private Integer prev = null;
	private List<Integer> list = new ArrayList<Integer>();
    public int[] findMode(TreeNode root) {
        if (root == null) {
        	return null;
        }
        traverse(root);
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
        	nums[i] = list.get(i);
        }
        return nums;
    }
    public void traverse(TreeNode root) {
    	if (root == null) {
    		return ;
    	}
    	traverse(root.left);
    	if (prev != null) {
    		if (root.val == prev) {
    			cnt++;
    		} else {
    			cnt = 1;
    		}
    	}
    	
    	if (cnt > max) {
    		max = cnt;
    		list.clear();
    		list.add(max);
    	} else if (cnt == max) {
    			list.add(cnt);
    	}  
    	prev = root.val;
    	traverse(root.right);
    }
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(2);
    	TreeNode right = new TreeNode(2);
    	TreeNode rightleft = new TreeNode(2);
    	root.right = right;
    	right.left = rightleft;
    	FindModeinBinarySearchTree fbs = new FindModeinBinarySearchTree();
    	fbs.findMode(root);
    	
    }
}
