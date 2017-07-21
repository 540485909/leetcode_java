/**
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author duanc
 *
 */
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
    	List<Integer> result = new ArrayList<>();
    	if (k <= 0 || nums == null || nums.length == 0) {
    		return result;
    	}
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
        	map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	if (bucket[entry.getValue()] == null) {
        		bucket[entry.getValue()] = new ArrayList<>();
        	}
        	bucket[entry.getValue()].add(entry.getKey());
        }
        
        for (int i = bucket.length - 1; i >= 0 && k > 0; --i) {
        	if (bucket[i] != null) {
        		for (int x : bucket[i]) {
        			result.add(x);
        			k--;
        		}
        	}
        }
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1,2};
		TopKFrequentElements ffe = new TopKFrequentElements();
		System.out.println(ffe.topKFrequent(nums, 2).toString());

	}

}
