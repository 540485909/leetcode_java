package easy;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (k <= 0 || nums.length == 0) {
        	return ;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
    public void swap(int[] nums, int left, int right) {
    	int temp = nums[left];
    	nums[left] = nums[right];
    	nums[right] = temp;
    }
    public void reverse(int [] nums, int left, int right) {
    	while (left < right) {
    		swap(nums, left++, right--);
    	}
    }
}
