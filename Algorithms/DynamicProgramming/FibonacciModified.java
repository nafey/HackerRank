import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    	int a = in.nextInt();
    	int b = in.nextInt();
    	int n = in.nextInt();

    	BigInteger[] nums = new BigInteger[20];

    	for (int i = 0; i < n; i++) {
    		if (i == 0) {
    			nums[0] = BigInteger.valueOf(a);
    		} else if (i == 1) {
    			nums[1] = BigInteger.valueOf(b);
    		} else {
    			nums[i] = nums[i-1].multiply(nums[i - 1]).add(nums[i - 2]);
    		}
    	}

    	System.out.println(nums[n - 1]);
    }
}