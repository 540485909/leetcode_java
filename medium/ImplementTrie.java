package medium;
class TrieNode{
	char val;
	boolean  isWord;
	TrieNode[] next = new TrieNode[26];
	TrieNode(char v) {
		this.val = v;
		this.isWord = false;
	}
}
public class ImplementTrie {
	private TrieNode root;
	public ImplementTrie() {
		root = new TrieNode(' ');
	}
	public void insert(String word) {
		TrieNode p = root;
		for (int i = 0; i < word.length(); ++i) {
			if (p.next[word.charAt(i) - 'a'] == null) {
				TrieNode node = new TrieNode(word.charAt(i));
				p.next[word.charAt(i) - 'a'] = node;
			}
			
			p = p.next[word.charAt(i) - 'a'];
		}
		p.isWord = true;
	}
	public boolean search(String word) {
		TrieNode p = helper(word);
		if (p != null && p.isWord == true) {
			return true;
		} else {
			return false;
		}
	
	}
	public TrieNode helper(String word) {
		TrieNode p = root;
		for (int i = 0; i < word.length(); ++i) {
			if (p.next[word.charAt(i) - 'a'] != null) {
				p = p.next[word.charAt(i) - 'a'];
			} else {
				return null;
			}
		}
		return p;
	}
	public boolean startsWith(String prefix) {
		TrieNode node = helper(prefix);
		if (node == null) {
			return false;
		} else {
			return true;
		}
	}
	public static void main(String[] args) {
		
	}
}
