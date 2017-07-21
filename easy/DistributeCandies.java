/**
 * 
 */
package easy;


import java.util.Arrays;

/**
 * @author duanc
 *
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int index = 0;
        for (int i = 1; i < candies.length; ) {
        	if (candies[i] == candies[i - 1]) {
        		i++;
        	} else {
        		index++;
        	}
        }
        return Math.min(candies.length/2, index + 1);
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
