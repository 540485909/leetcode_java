/**
 * 
 */
package medium;


import java.util.Arrays;
import java.util.Comparator;


/**
 * @author duanc
 *
 */

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
 }
class MyInterval {
	int index;
	Interval interval;
	MyInterval(int i, Interval inter) {
		this.index = i;
		this.interval = inter;
	}
}

public class FindRightInterval {
	public int binarySearch(MyInterval[] myIntervals, int endPos, int index) {
		int start = index + 1, end = myIntervals.length - 1;
		if (start > end) {
			return -1;
		}
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (myIntervals[mid].interval.start >= endPos) {
				end = mid;
			} else  {
				start = mid;
			}
		}
		if (myIntervals[start].interval.start >= endPos) {
			return start;
		} else if (myIntervals[end].interval.start >= endPos) {
			return end;
		}
		return -1;
	}
    public int[] findRightInterval(Interval[] intervals) {
    	int len = intervals.length;
    	if (len <= 1) {
    		int[] result = new int[1];
    		result[0] = -1;
    		return  result;
    	}
        MyInterval[] myInter = new MyInterval[len]; 
        for (int i = 0; i < intervals.length; ++i) {
        	myInter[i] = new MyInterval(i, new Interval(intervals[i].start, intervals[i].end));
        }
        Arrays.sort(myInter, new Comparator<MyInterval>() {

			@Override
			public int compare(MyInterval o1, MyInterval o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.interval.start, o2.interval.start) ;
			}
        	
        });
        int[] result = new int[len];
        for (int i = 0; i < myInter.length; ++i) {
        	int index = binarySearch(myInter, myInter[i].interval.end, i);
        	if (index == -1) {
        	    result[myInter[i].index] = -1;
        	}
        	 else {
        	     result[myInter[i].index] = myInter[index].index;
        	 }
        }
        return result;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
