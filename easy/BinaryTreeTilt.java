package easy;

import util.TreeNode;

class ReturnType{
	public int sum;
	public int tile;
	public ReturnType(int s, int t){
		this.sum = s;
		this.tile = t;
	}
}
public class BinaryTreeTilt {
    public int findTilt(TreeNode root) {
        if (root == null) {
        	return 0;
        }
        ReturnType result = helper(root);
        return result.tile;
    }
    ReturnType helper(TreeNode root) {
    	if (root == null) {
    		return new ReturnType(0, 0);
    	}
    	/*divide */
    	ReturnType left = helper(root.left);
    	ReturnType right = helper(root.right);
    	ReturnType cur = new ReturnType(0, 0);
    	
    	/*conquer*/
    	cur.tile = Math.abs(left.sum - right.sum) + left.tile + right.tile;
    	cur.sum = left.sum + right.sum + root.val;
    	return cur;
    }
}
