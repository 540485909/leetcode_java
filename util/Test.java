package util;


import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Test {
	public void reverseTree(TreeNode root) {
		if (root == null) {
			return ;
		}
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.left = right;
		root.right = left;
		reverseTree(root.left);
		reverseTree(root.right);
	}
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer>  list = new ArrayList<Integer>();
		list.add(10);
		list.add(8);
		list.add(12);
		Collections.sort(list, (Integer a, Integer b)->{
			return a.compareTo(b);
		});
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a.compareTo(b);
			}
		});
		System.out.println(list.toString());
	
		 
        String result = "ºÃ³Ô\uD83DÕæºÃ³Ô";
        System.out.println("duan");
        System.out.println("duan");
        
        
	}
}
