package easy;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
    	if (haystack == null || needle == null) {
    		return -1;
    	}
        for (int i = 0; i <= haystack.length() - needle.length(); ++i) {
        	int j = 0;
        	int k = i;
        	while (j < needle.length()) {
        		if (haystack.charAt(k) == needle.charAt(j)) {
        			k++;
        			j++;
        		} else {
        			break;
        		}
        	}
        	if (j == needle.length()) {
        		return k - j;
        	}
        }
        return -1;
    }
    public static void main(String[] args) {
    	ImplementstrStr is = new ImplementstrStr();
    	System.out.println(is.strStr("mississippi", "issip"));
    }
}
