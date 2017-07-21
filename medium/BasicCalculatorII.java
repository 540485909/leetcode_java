/**
 * 
 */
package medium;

import java.util.Stack;

/**
 * @author duanc
 *
 */
public class BasicCalculatorII {
    public int calculate(String s) {
        Stack<Character> operstk = new Stack<>();
        Stack<Integer> numstk = new Stack<>();
        int i = 0;
        int value = 0;
        while (i < s.length()) {
        	if (s.charAt(i) == ' ') {
        		i++;
        		continue;
        	}
        	if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
        		value = value * 10 + (s.charAt(i) - '0');
        	} else {
        		numstk.add(value);
        		value = 0;
        		if (s.charAt(i) == '+' || s.charAt(i) == '-') {
        			while (!operstk.empty()) {
        				char top = operstk.peek();
        				int num2 = numstk.pop();
        				int num1 = numstk.pop();
        				numstk.add(cal(num1,num2, top));
        				operstk.pop();
        			}
        		} else if (s.charAt(i) == '*' || s.charAt(i) == '/') {
        			while (!operstk.empty()) {
        				char top = operstk.peek();
        				if (top == '*' || top == '/') {
        					int num2 = numstk.pop();
            				int num1 = numstk.pop();
            				numstk.add(cal(num1,num2, top));
            				operstk.pop();
        				} else {
        					break;
        				}
        			}
        		}
        		operstk.push(s.charAt(i));
        	}
        	i++;
        }
        numstk.push(value);
        while (!operstk.empty()) {
        	int num2 = numstk.pop();
        	int num1 = numstk.pop();
        	numstk.push(cal(num1, num2, operstk.pop()));
        }
        return numstk.pop();
        
    }
    private int cal(int num1, int num2, char oper) {
    	switch (oper) {
    		case '+':
    			return num1 + num2;
    		case '-':
    			return num1 - num2;
    		case '*':
    			return num1 * num2;
    		case '/':
    			return num1 / num2;
    		default:
    			break;
    	}
    	return 0;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculatorII bc = new BasicCalculatorII();
		System.out.println(bc.calculate(" 3/2 "));
	}

}
