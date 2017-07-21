/**
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * @author duanc
 *
 */
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < wordList.size(); ++i) {
        	wordSet.add(wordList.get(i));
        }
        wordList.add(endWord);
        Queue<String> que = new LinkedList<>();
        que.offer(beginWord);
        int level = 1;
        while (!que.isEmpty()) {
        	int size = que.size();
        	for (int i = 0; i < size; ++i) {
        		String front = que.poll();
        		if (front.equals(endWord)) {
        			return level;
        		}
        		List<String> nextWords = new ArrayList<>();
        		addNextWords(front, wordSet,  nextWords);
        		for (String s : nextWords) {
        			que.add(s);
        		}
        	}
        	level++;
        }
        return level;
    }
    private void addNextWords(String word, Set<String> wordList,
    		List<String> nextWords) {
    	for (int i = 0; i < word.length(); ++i) {
    		StringBuilder tempWord = new StringBuilder(word);
    		for (char ch = 'a'; ch <= 'z'; ++ch) {
    			tempWord.replace(i, i + 1, ch+"");
    			if (tempWord.toString().equals(word) 
    					||!wordList.contains(tempWord.toString()) ){
        			continue;
        		}
    			nextWords.add(tempWord.toString());
    			wordList.remove(tempWord.toString());
    		}
    		
    	}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordLadder wl = new WordLadder();
		String[] words = new String[]{"hot","dot","dog","lot","log","cog"};
		List<String> wordList = new ArrayList<>();
		wordList.addAll(Arrays.asList(words));
		System.out.println(wl.ladderLength("hit", "cog", wordList));
	}

}
