/**
 * 
 */
package medium;

/**
 * @author duanc
 *
 */
public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums ==  null || nums.length <= 0) {
        	return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left + 1 < right) {
        	int mid = left + (right - left) / 2;
        	if (nums[mid] == target) {
        		return mid;
        	} else if (nums[mid] < nums[right]) {
        		/*right part is ordered*/
        		if (target > nums[mid] && target <= nums[right]) {
        			left = mid;
        		} else {
        			right = mid;
        		}
        	} else {
        		if (target < nums[mid] && target >= nums[left]) {
        			right = mid;
        		} else {
        			left = mid;
        		}
        	}
        }
        if (nums[left] == target ) {
        	return left;
        } else if (nums[right] == target) {
        	return right;
        }
        return -1;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
