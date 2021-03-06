/**
 * 
 */
package medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author duanc
 *
 */
public class BrickWall {
	
    public int leastBricks(List<List<Integer>> wall) {
    	  if(wall.size() == 0) return 0;
          int count = 0;
          Map<Integer, Integer> map = new HashMap<Integer, Integer>();
          for(List<Integer> list : wall){
              int length = 0;
              for(int i = 0; i < list.size() - 1; i++){
                  length += list.get(i);
                  map.put(length, map.getOrDefault(length, 0) + 1);
                  count = Math.max(count, map.get(length));
              }
          }
          return wall.size() - count;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
