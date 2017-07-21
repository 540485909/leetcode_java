/**
 * 
 */
package hard;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author duanc
 *
 */
public class FindMedianfromDataStream {
    /** initialize your data structure here. */
	FindMedianfromDataStream() {
		minHeap = new PriorityQueue<Integer>(1, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return b.compareTo(a);
			}
		});
		maxHeap = new PriorityQueue<Integer>();
	}
    private PriorityQueue<Integer> maxHeap, minHeap;
    private int size = 0;
    public void addNum(int num) {
        maxHeap.offer(num);
        size++;
        if (size % 2 != 0) {
        	minHeap.offer(maxHeap.poll());
        }
        

    }
    
    public double findMedian() {
        if (size % 2 != 0) {
        	return minHeap.peek();
        } else {
        	return (minHeap.peek() + maxHeap.peek())/2.0;
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMedianfromDataStream ffd = new FindMedianfromDataStream();
		ffd.addNum(1);
		System.out.println(ffd.findMedian());
		ffd.addNum(2);
		System.out.println(ffd.findMedian());
		ffd.addNum(3);
		System.out.println(ffd.findMedian());

	}

}
