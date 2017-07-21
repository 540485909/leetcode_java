/**
 * 
 */
package util;

/**
 * @author duanc
 *
 */
public class Heapsort {
	public void heapSort(int[] nums) {
		buildHeap(nums);
		int size = nums.length;
		for (int i = 0; i < nums.length; ++i) {
			heapAdjust(nums, 0, size--);
			Util.swap(nums, 0, size);
		}
	}
	private void buildHeap(int[] nums) {
		for (int i = nums.length / 2; i >= 0; --i) {
			heapAdjust(nums, i, nums.length);
		}
	}
	private void heapAdjust(int[] nums, int root, int size) {
		int left = 2 * root + 1;
		int right = 2 * root + 2;
		if (root >= size || left >= size) {
			return;
		}
		int next = left;
		if (right < size  && nums[right] > nums[left]) {
			next = right;
		}
		Util.swap(nums, root, next);
		heapAdjust(nums, next, size);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heapsort qs = new Heapsort();
		int[] nums = new int[]{4,1,2,1};
		qs.heapSort(nums);
		System.out.println(nums.toString());
	}

}
