import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static boolean isFunny(String s, String r) {
		for (int i = 1; i < s.length(); i++) {
			if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 
				Math.abs(r.charAt(i) - r.charAt(i - 1))) {
				return false;
			}
		}

		return true;
	}

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
        	String s = in.next();
        	StringBuffer sb = new StringBuffer("");

        	for (int i = 0; i < s.length(); i++) {
        		sb.append(s.charAt(s.length() - 1 - i));
        	}

        	String r = sb.toString();

        	if (isFunny(s, r)) {
        		System.out.println("Funny");
        	} else {
        		System.out.println("Not Funny");
        	}
        }
    }
}