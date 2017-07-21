/**
 * 
 */
package medium;
import java.util.*;
/**
 * @author duanc
 *
 */
public class InsertDeleteGetRandom {
	 /** Initialize your data structure here. */
	
    public InsertDeleteGetRandom() {
        
    }
    private Map<Integer, Integer> map = new HashMap<>();
    private List<Integer> array = new ArrayList<>();
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
        	return false;
        }
        array.add(val);
        map.put(val, array.size() - 1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	if (!map.containsKey(val)) {
    		return false;
    	}
    	array.set(map.get(val),array.get(array.size() - 1));
    	map.put(array.get(array.size() - 1),map.get(val));
    	array.remove(array.size() - 1);
    	map.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random();
        random.nextInt(array.size());
        int index = Math.abs(random.nextInt(array.size()) % array.size());
        return array.get(index);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertDeleteGetRandom id = new InsertDeleteGetRandom();
		//["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
		//		[[],[1],[2],[2],[],[1],[2],[]]
		id.insert(1);
		id.remove(2);
		id.insert(2);
		id.getRandom();
		id.remove(1);
		id.insert(2);
		id.getRandom();
	}

}
