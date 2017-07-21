/**
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author duanc
 *
 */
public class MinimumTimeDifference {
	public int convertTime(String time) {
		String[] strs = time.split(":");
		Integer hour = Integer.valueOf(strs[0]);
		Integer minute = Integer.valueOf(strs[1]);
		return hour * 60 + minute;
	}
    public int findMinDifference(List<String> timePoints) {
        if (timePoints == null || timePoints.size() == 0) {
        	return 0;
        }
        List<Integer> timeArr = new ArrayList<Integer>();
        for (int i = 0; i< timePoints.size(); ++i) {
        	int value = convertTime(timePoints.get(i));
        	timeArr.add(value);
        	timeArr.add(value + 24 * 60);
        }
        Collections.sort(timeArr, new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg0.compareTo(arg1);
			}
        	
        });
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < timeArr.size(); ++i) {
        	minDiff = Math.min(minDiff, timeArr.get(i) - timeArr.get(i - 1));
        }
        return minDiff;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List <String> timePoints = new ArrayList<String>();
        timePoints.add("05:31");
        timePoints.add("22:08");
        timePoints.add("00:35");
        MinimumTimeDifference mtd = new MinimumTimeDifference();
        mtd.findMinDifference(timePoints);
     
	}

}
