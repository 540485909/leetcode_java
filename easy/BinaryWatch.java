package easy;

import java.util.ArrayList;
import java.util.List;

public  class BinaryWatch {
    public List<String> readBinaryWatch(int num) {
    	List<String> result = new ArrayList<String>();
        for (int h = 0; h < 12; ++h) {
        	for (int m = 0; m < 60; ++m) {
        		int count = Integer.bitCount(h * 60 + m);
        		if (count == num) {
        			result.add(String.format("%d:%2d", h, m));
        		}
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
