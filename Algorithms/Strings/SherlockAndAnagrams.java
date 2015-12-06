import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) return false;

		char[] carr1 = str1.toCharArray();
		char[] carr2 = str2.toCharArray();

		Arrays.sort(carr1);
		Arrays.sort(carr2);

		return Arrays.equals(carr1, carr2);
	}


    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int t = myScan.nextInt();

        for (int a = 0; a < t; a++) {
        	String first = myScan.next();

        	int len = 1;

        	HashMap<String, Integer> hm = new HashMap<>();


        	while (len < first.length()) {
        		for (int i = 0; i < first.length() - (len - 1); i++) {

        			String str = first.substring(i, i + len);

        			char[] carr = str.toCharArray();
        			Arrays.sort(carr);

        			str = String.valueOf(carr);

        			if (hm.containsKey(str)) {
        				hm.put(str, hm.get(str) + 1);
        			} else {
        				hm.put(str, 1);
        			}
        		}

        		len++;
        	}

        	int pairCount = 0;
        	for (Integer i : hm.values()) {
        		if (i >= 2) {
        			pairCount += (i * i - i) / 2;
        		}
        	} 

        	System.out.println(pairCount);
        }
    }
}