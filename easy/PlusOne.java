package easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int c = 1;
        if (digits == null || digits.length == 0) {
        	return new int[]{};
        }
        for (int i = digits.length - 1; i >= 0; --i) {
        	digits[i] = digits[i] + c;
        	c = digits[i] / 10;
        	digits[i] = digits[i] % 10;
        }
        if (c > 0) {
        	int[] result = new int[digits.length + 1];
        	for (int i = 0; i < digits.length; ++i) {
        		result[i + 1] = digits[i];
        	}
        	result[0] = c;
        	return result;
        }
        return digits;
        
    }
}
