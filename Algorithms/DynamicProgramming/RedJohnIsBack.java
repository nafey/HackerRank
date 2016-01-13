import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void removeNonPrimes(boolean[] non, int p) {
        for (int i = 2 * p; i < non.length; i+=p) {
            non[i] = true;
        }
	}

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int t = in.nextInt();
        
        
    	int[] dp = new int[41];

    	dp[0] = 1;
    	dp[1] = 1;
    	dp[2] = 1;
    	dp[3] = 1;
    	dp[4] = 2;
        
        for (int i = 5; i <= 40; i++) {
    		dp[i] = dp[i -4] + dp[i - 1];
    	}
        
        boolean[] non = new boolean[dp[40] + 1];
        
        int idx = 2;
        
        while (idx < non.length) {
            if (!non[idx]) {
                removeNonPrimes(non, idx);        
            }
            
            idx++;
        }
        

    	for (int a = 0; a < t; a++) {
    		int n = in.nextInt();
            
            int count = 0;
            
            for (int i = 2; i <= dp[n]; i++) {
                if (!non[i]) count++;
            }
            
            System.out.println(count);
    	}
    }
}