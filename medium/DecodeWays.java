package medium;

import java.util.Arrays;

public class DecodeWays {
    public int numDecodings(String s) {
        int len = s.length();
        if (len == 0) {
        	return 0;
        }
        int[] dp = new int[len + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= len; ++i) {
        	if (s.charAt(i - 1) == '0') {
        		dp[i - 1] = 0;
        	}
        	if (i < 2 || !(s.charAt(i - 2) == '1' || s.charAt(i - 2) == '2' && s.charAt(i - 1) <= '6')) {
        		dp[i - 2] = 0;
        	}
        	dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[len];
        
    }
    public static void main(String[] args) {
    	DecodeWays dw = new DecodeWays();
    	System.out.println(dw.numDecodings("112412"));
    }
}
