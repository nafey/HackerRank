import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static String units(int n) {
		String TEEN = "teen";

		String TWENTY = "twenty ";

		switch (n) {
			case 0: 
				return "";
			case 1:
				return "one";
			case 2:
				return "two";
			case 3: 
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";
			case 8:
				return "eight";
			case 9:
				return "nine";
			case 10:
				return "ten";
			case 11:
				return "eleven";
			case 12:
				return "twelve";
			case 13:
				return "thirteen";
			case 14:
				return "fourteen";
			case 15:
				return "quarter";
		}

		if (n < 20) {
			return units(n - 10) + TEEN;
		}

		if (n < 30) {
			return TWENTY + units(n - 20);
		}

		if (n == 30) {
			return "half";
		}

		return "";
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();

        String MINUTES = " minutes";
        String PAST = " past ";
        String TO = " to ";



        if (m == 0) {
        	System.out.println(units(h) + " o' clock");
        } else if (m == 1) {
        	System.out.println("one minute past " + units(h));

        } else if (m == 15) {
        	System.out.println(units(m) + PAST + units(h));
        } else if (m == 30) {
        	System.out.println(units(m) + PAST + units(h));
        } else if (m <= 30) {
        	System.out.println(units(m) + MINUTES + PAST + units(h));
        } else if (m == 45) {
        	if (h != 12) {
        		System.out.println(units(60 - m) + TO + units(h + 1));
        	} else {
        		System.out.println(units(60 - m) + TO + units(1));
        	}
        } else if (m < 60) {
        	if (h != 12) {
        		System.out.println(units(60 - m) + MINUTES + TO + units(h + 1));
        	} else {
        		System.out.println(units(60 - m) + MINUTES + TO + units(1));
        	}
        }
    }
}
