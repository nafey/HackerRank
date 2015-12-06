import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static boolean hasElement(char[] carr, char c) {
		for (char carr_i : carr) {
			if (carr_i == c) return true;
		}

		return false;
	}

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	String s = in.nextLine();
    	s = s.toLowerCase();

    	char[] carr = new char[26];

    	for (int i = 0; i < 26; i++) {
    		carr[i] = ' ';
    	}

    	int index = 0;

    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) != ' '){
    			if (!hasElement(carr, s.charAt(i))) {
    				carr[index] = s.charAt(i);
    				index++;
    			}
    		}
    	}

    	if (index == 26) {
    		System.out.println("pangram");
    	} else {
    		System.out.println("not pangram");
    	}

    }
}