package util;

import java.util.ArrayList;
import java.util.Collections;

public class Bucketsort {
	public static void bucketsort(int[] nums) {
		int len = nums.length;
		if (len < 1) {
			return ;
		}
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < len; ++i) {
			maxValue = Math.max(maxValue, nums[i]);
			minValue = Math.min(minValue, nums[i]);
		}
		int bucketSegment = (maxValue - minValue)/len + 1;
		int bucketCount = (maxValue - minValue) / bucketSegment + 1;
		ArrayList<Integer>[] buckets = new ArrayList[bucketCount];
		for (int i = 0; i < buckets.length; ++i) {
			buckets[i] = new ArrayList<Integer>();
		}
		for (int i : nums) {
			buckets[(i - minValue)/ bucketSegment].add(i);
		}
		for (ArrayList<Integer> list : buckets) {
			Collections.sort(list);
		}
		int index  = 0;
		for (ArrayList<Integer> list : buckets) {
			for (int x : list) {
				nums[index++] = x;
			}
		}
	}
}
