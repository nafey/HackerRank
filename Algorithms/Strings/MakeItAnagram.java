import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        String first = myScan.next();
        String second = myScan.next();

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (Character c : first.toCharArray()) {
        	if (hm1.containsKey(c)) {
        		hm1.put(c, hm1.get(c) + 1);
        	} else {
        		hm1.put(c, 1);
        	}
        }

        for (Character c : second.toCharArray()) {
        	if (hm2.containsKey(c)) {
        		hm2.put(c, hm2.get(c) + 1);
        	} else {
        		hm2.put(c, 1);
        	}
        }

        for (char i = 97; i < 123; i++) {
        	if (hm1.containsKey(i) && hm2.containsKey(i)) {
        		int min = (hm1.get(i) < hm2.get(i)) ? hm1.get(i) : hm2.get(i);

        		hm1.put((char)(i), hm1.get(i) - min);
        		hm2.put((char)(i), hm2.get(i) - min);
        	}
        }

        int count = 0;

        for (int x : hm1.values()) {
        	count += x;
        }

        for (int x : hm2.values()) {
        	count += x;
        }

       	System.out.println(count);
    }
}