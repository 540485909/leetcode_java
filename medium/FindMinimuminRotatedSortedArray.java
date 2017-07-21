/**
 * 
 */
package medium;

/**
 * @author duanc
 *
 */
public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
        	int mid = start + (end - start) /2;
        	if (mid - 1 >= 0 && nums[mid] < nums[mid - 1]) {
        		return nums[mid];
        	} else if (nums[mid] < nums[end]) {
        		end = mid;
        	} else {
        		start = mid;
        	}
        	
        }
        if (nums[end] < nums[start]) {
    		return nums[end];
    	} else {
    		return nums[start];
    	}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMinimuminRotatedSortedArray fmrs = new FindMinimuminRotatedSortedArray();
		System.out.println(fmrs.findMin(new int[]{2,3,1}));
	}

}
