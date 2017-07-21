package medium;

public class BombEnemy {
	 public int maxKilledEnemies(char[][] grid) {
	        int row = grid.length;
	        if (row == 0) {
	            return 0;
	        }
	        int col = grid[0].length;
	        int maxKilled = 0;
	        for (int i = 0; i < row; ++i) {
	            for (int j = 0; j < col; ++j) {
	                if (grid[i][j] == '0') {
	                    maxKilled = Math.max(maxKilled, killedEnemies(grid, i, j));
	                }
	                
	            }
	        }
	        return maxKilled;
	    }
	    private int killedEnemies(char[][] grid, int i, int j) {
	        int row = grid.length;
	        int column = grid[0].length;
	        /*same row*/
	        int number = 0;
	        for (int index = j - 1; index >= 0; --index) {
	            if (grid[i][index] == 'W') {
	                break;
	            } else if (grid[i][index] == 'E') {
	                number++;
	            }
	        }
	        for (int index = j + 1; index < column; ++index) {
	            if (grid[i][index] == 'W') {
	                break;
	            } else if (grid[i][index] == 'E') {
	                number++;
	            }
	        }
	        
	        for (int index = i - 1; index >= 0; --index) {
	            if (grid[index][j] == 'W') {
	                break;
	            } else if (grid[index][j] == 'E') {
	                number++;
	            }
	        }
	        for (int index = i + 1; index < row; ++index) {
	            if (grid[index][j] == 'W') {
	                break;
	            } else if (grid[index][j] == 'E') {
	                number++;
	            }
	        }
	       
	        return number;
	    }
}
