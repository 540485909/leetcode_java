/**
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

/**
 * @author duanc
 *
 */
public class SumRoottoLeafNumbers {
	
	 public int sumNumbers(TreeNode root) {
		 List<List<Integer> > allPath = new ArrayList<List<Integer> >();
		 List<Integer> curPath = new ArrayList<>();
		 helper(allPath, curPath, root);
		 List<Integer> sumLists = compass(allPath);
		 int result = 0;
		 for (int i : sumLists) {
			 result += i;
		 }
		 return result;
	 }
	 private void helper(List<List<Integer> > result, List<Integer> cur, TreeNode root) {
		 if (root == null) {
			 return;
		 }
		 
		 cur.add(root.val);
		 
		 if (root.left == null && root.right == null) {
			 result.add(new ArrayList<>(cur));
		 }
		
		 helper(result, cur, root.left);
		 helper(result, cur, root.right);
		 cur.remove(cur.size() - 1);
	 }
	 private List<Integer> compass(List<List<Integer> > allPath) {
		 List<Integer> result = new ArrayList<>();
		 for (int i = 0; i < allPath.size(); ++i) {
			 int compassValue = 0;
			 for (int j = 0; j < allPath.get(i).size(); ++j) {
				 compassValue = 10 * compassValue + allPath.get(i).get(j);
			 }
			 result.add(compassValue);
		 }
		 return result;
	 }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		root.left = left;
		root.right = right;
		SumRoottoLeafNumbers srf = new SumRoottoLeafNumbers();
		System.out.println(srf.sumNumbers(root));
	}

}
