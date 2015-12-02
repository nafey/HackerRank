import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static int sumUp(String a, int size) {
		int sum = 0;

		for (int i = 0; i < size; i++) {
			if (a.charAt(i) == '1') {
				sum++;
			}
		}

		return sum;
	}

	public static String bitWiseAdd(String a, String b, int size) {
		char[] c = new char[size];

		for (int i = 0; i < size; i++) {
			if (a.charAt(i) == '1' || b.charAt(i) == '1') {
				c[i] = '1';
			} else {
				c[i] = '0';
			}
		}

		return String.valueOf(c);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }

        int topics = 0;
        int teams = 0;

        for (int i = 0; i < n; i++) {
        	for (int j = i + 1; j < n; j++) {
        		int sum = sumUp(bitWiseAdd(topic[i], topic[j], m), m);
        		if (sum > topics) {
    				topics = sum;
    				teams = 1;
        		} else if (sum == topics) {
        			teams++;
        		}
        	}
        }

        System.out.println(topics);
        System.out.println(teams);

    }
}
