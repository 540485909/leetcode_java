package util;

public  class Mergesort {
	public void mergeSort(int[] nums) {
		mergeSort(nums, 0, nums.length - 1);
	}
	private void mergeSort(int[] nums, int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(nums, left, mid);
		mergeSort(nums, mid + 1, right);
		merge(nums, left, mid, right);
	}
	private void merge(int[] nums, int left, int mid, int right) {
		int i = left, j= mid + 1;
		int[] mergeNums = new int[nums.length];
		int index = left;
		while (i <= mid && j <= right) {
			if (nums[i] < nums[j]) {
				mergeNums[index++] = nums[i++];
				
			} else {
				mergeNums[index++] = nums[j++];
			}
			
		}
		while (i <= mid) {
			mergeNums[index++] = nums[i++];
		}
		while (j <= right) {
			mergeNums[index++] = nums[j++];
		}
		for (int k = left; k <= right; ++k) {
			nums[k] = mergeNums[k];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mergesort ms = new  Mergesort();
        int[] nums = new int[]{4,1,2,1,2,3,4};
        ms.mergeSort(nums);
        System.out.println(1);
	}

}
