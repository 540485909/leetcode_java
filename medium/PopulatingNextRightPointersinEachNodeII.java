/**
 * 
 */
package medium;

import util.TreeLinkNode;

/**
 * @author duanc
 *
 */
public class PopulatingNextRightPointersinEachNodeII {
    public void connect(TreeLinkNode root) {
        while (root != null) {
        	TreeLinkNode prev = null; // the prevous node for the same level
        	TreeLinkNode next = null; // the first node for next level
        	for (; root != null; root = root.next) {
        		if (next == null) {
        			next = root.left == null ? root.right : root.left;
        		}
        		if (root.left != null) {
        			if (prev != null) {
        				prev.next = root.left;
        			}
        			prev = root.left;
        		}
        		if (root.right != null) {
        			if (prev != null) {
        				prev.next = root.right;
        			}
        			prev = root.right;
        		}
        	}
        	root = next;
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
