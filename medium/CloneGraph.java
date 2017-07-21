/**
 * 
 */
package medium;

import java.util.HashMap;
import java.util.Map;

import util.UndirectedGraphNode;

/**
 * @author duanc
 *
 */
public class CloneGraph {
	/**
	 * Definition for undirected graph.
	 * class UndirectedGraphNode {
	 *     int label;
	 *     List<UndirectedGraphNode> neighbors;
	 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	 * };
	 */
	public class Solution {
	    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
	    	if (node == null) {
	    		return null;
	    	}
	        Map<UndirectedGraphNode, UndirectedGraphNode> hashMap = new HashMap<>();
	        dfs(node, hashMap);
	        return hashMap.get(node);
	    }
	    private UndirectedGraphNode dfs(UndirectedGraphNode node, 
	    		Map<UndirectedGraphNode,UndirectedGraphNode> hashMap) {
	    	if (hashMap.containsKey(node)) {
	    		return hashMap.get(node);
	    	}
	    	UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
	    	hashMap.put(node, newNode);
	    	for (UndirectedGraphNode neighborNode : node.neighbors) {
	    		newNode.neighbors.add(dfs(neighborNode, hashMap));
	    	}
	    	return newNode;
	    }
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
