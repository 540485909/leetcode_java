/**
 * 
 */
package util;

/**
 * @author duanc
 *
 */
public class Quicksort {
	public void quicksort(int[] nums) {
		int left = 0, right = nums.length - 1;
		quicksort(nums, left, right);
	}
	private void quicksort(int[] nums, int left, int right) {
		
		if (left < right) {
			int mid = partition(nums, left, right);
			quicksort(nums, left, mid - 1);
			quicksort(nums, mid + 1, right);
		}
	}
	private int partition(int[] nums, int left, int right) {
		if (left >= right) {
			return left;
		}
		int pos = left;
		int pivot = nums[pos];
	
		while (left < right) {
			while (left < right && nums[right] >= pivot) {
				right--;
			}
			while (left < right && nums[left] <= pivot) {
				left++;
			}
			swap(nums, left, right);
		}
		
		swap(nums, pos, left);
		
	
		return left;
		
	}
	private void swap(int[] nums, int left, int right) {
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quicksort qs = new Quicksort();
		int[] nums = new int[]{4,1,2,1};
		qs.quicksort(nums);
		System.out.println(nums.toString());
		
	}

}
