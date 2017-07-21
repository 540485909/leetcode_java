package medium;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        String result = new String();
        if (s == null || s.length() == 0) {
        	return result;
        }
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
        	hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        String[] bucket = new String[s.length() + 1];
        for (char c : hashMap.keySet()) {
        	bucket[hashMap.get(c)] = bucket[hashMap.get(c)] == null ? c + "" : bucket[hashMap.get(c)] + c;
        }
        StringBuilder res = new StringBuilder();
        for (int i = bucket.length - 1; i >= 0; --i) {
        	if (bucket[i] != null) {
        		char[] arr = bucket[i].toCharArray();
        		Arrays.sort(arr);
        		for (int j = 0; j < arr.length; ++j) {
        			for (int loop = 0; loop < i; ++loop) {
            			res.append(arr[j]);
            		}
        		}
        		
        		
        	}
        }
        return res.toString();
        
    }
    public static void main(String[] args) {
    	SortCharactersByFrequency scb = new SortCharactersByFrequency();
    	System.out.println(scb.frequencySort("eeeee"));
    }
}
