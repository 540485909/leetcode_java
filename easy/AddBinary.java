package easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        if (a == null || a.length() ==  0) {
        	return b;
        }
        if (b == null || b.length() == 0) {
        	return a;
        }
        int lena = a.length();
        int lenb = b.length();
        int i = lena - 1;
        int j = lenb - 1;
        int c = 0;
        String result = "";
        while (i >= 0 || j >= 0 || c != 0) {
        	int valueA = i >= 0 ? a.charAt(i) - '0' : 0;
        	int valueB = j >= 0 ? b.charAt(j) - '0' : 0;
        	int valueC = valueA + valueB + c;
        	
        	result = (valueC % 2) + result;
        	c = valueC / 2;
        	i--;
        	j--;
        }
        return result;
    }
    public static void main(String[] args) {
    	AddBinary ab = new AddBinary();
    	ab.addBinary("0", "0");
    }
}
