/**
 * 
 */
package medium;

import java.util.Arrays;

/**
 * @author duanc
 *
 */
public class FourSumII {
	public int upperBound(int[] arr, int start, int end, int target) {
		while (start + 1 < end) {
			int mid = start +(end - start) / 2;
			if (arr[mid] <= target) {
				start = mid;
			} else {
				end = mid ;
			}	
		}
		if (arr[end] == target) {
			return end + 1;
		} else if (arr[start] == target) {
			return start + 1;
		} else {
			return -1;
		}
	
	}
	public int lowerBound(int[] arr, int start, int end, int target) {
		while (start < end) {
			int mid = start +(end - start) / 2;
			if (arr[mid] < target) {
				start = ++mid;
			} else {
				end = mid ;
			}
			
		}
		if (arr[start] == target) {
			return start;
		} else if (arr[end] == target) {
			return end ;
		} else {
			return -1;
		}
	}
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int [] midResult = new int[A.length * B.length];
        for (int i = 0; i < A.length; ++i) {
        	for (int j = 0; j < B.length; ++j) {
        		midResult[i * B.length + j] = A[i] + B[j];
        	}
        }
        Arrays.sort(midResult);
        int result = 0;
        for (int i = 0; i < C.length; ++i) {
        	for (int j = 0; j < D.length; ++j) {
        		result += upperBound(midResult, 0, A.length * B.length - 1  , -C[i]- D[j]) - 
        				lowerBound(midResult, 0, A.length * B.length - 1 ,-C[i]- D[j]);
        	}
        }
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2};
		int[] b = {-2,-1};
		int[] c = {-1,2};
		int[] d = {0,2};
		FourSumII fs = new FourSumII();
		System.out.println(fs.fourSumCount(a, b, c, d));
	}

}
