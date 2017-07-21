package easy;

import util.TreeNode;

public class SubtreeofAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
        	return t == null;
        }
        if (s.val != t.val) {
        	return false;
        }
        
        return isSubtree(s.left, t.left) && isSubtree(s.right, t.right);
    }
}
