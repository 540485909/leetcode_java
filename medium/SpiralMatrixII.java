/**
 * 
 */
package medium;

/**
 * @author duanc
 *
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int [][] result = new int[n][n];
        int up = 0, right = n - 1, down = n - 1, left = 0;
        int generate = 1;
        while (left <= right && up <= down) {
        	 /*up*/
            for (int i = left; i <= right; ++i) {
            	result[up][i] = generate++;
            }
            up++;
            
            /*right*/ 
            for (int i = up; i <= down; ++i) {
            	result[i][right] = generate++;
            }
            right--;
            
            /*down*/
            for (int i = right; i >= left; --i) {
            	result[down][i] = generate++;
            }
            down--;
            
            /*left*/ 
            for (int i = down; i >= up; --i) {
            	result[i][left] = generate++;
            }
            left++;
        }
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralMatrixII gm = new SpiralMatrixII();
		System.out.println(gm.generateMatrix(4));
	}

}
