/**
 * 
 */
package medium;
import java.util.HashMap;
import java.util.Map;
/**
 * @author duanc
 *
 */
public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
        	sum += nums[i];
        	if (k != 0) {
        		sum = sum % k;
        	}
        	if (map.containsKey(sum)) {
        		if ( i - map.get(sum) > 1) {
        			return true;
        		}
        	}
        	map.put(sum, i);
        }
       
        return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
