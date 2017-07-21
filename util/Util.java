package util;

public class Util {
	public static void swap(int[] nums, int left, int right) {
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}
	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			swap(nums, start++, end--);
		}
	}
}
