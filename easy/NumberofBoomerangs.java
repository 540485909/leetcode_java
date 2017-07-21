package easy;

import java.util.HashMap;
import java.util.Map;

public class NumberofBoomerangs {
	public int getDistance(int [] point1, int [] point2) {
		return Math.abs (point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);
	}
    public int numberOfBoomerangs(int[][] points) {
        if (points.length == 0) {
        	return 0;
        }
        Map<Integer, Integer> disMap = new HashMap<Integer, Integer>();
        int result = 0;
        for (int i = 0; i < points.length; ++i) {
        	for (int j = i + 1; j < points.length; ++j) {
        		int distance = getDistance(points[i], points[j]);
        		disMap.put(distance, disMap.getOrDefault(distance, 0) + 1);
        	}
        	for (int vals : disMap.values()) {
        		result += vals * (vals - 1) /2;
        	}
        	disMap.clear();
        }
        return result;
    }
}
