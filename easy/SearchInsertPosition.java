/**
 * 
 */
package easy;

/**
 * @author duanc
 *
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
        	return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left + 1 < right) {
        	int mid = left + (right - left) / 2;
        	if (nums[mid] == target) {
        		return mid;
        	} else if (nums[mid] < target) {
        		left = mid;
        	} else {
        		right = mid;
        	}
        }
        if (nums[right] < target) {
        	return right + 1;
        }
        if (nums[right] == target || nums[left] < target) {
        	return right;
        }
        
        return left;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
