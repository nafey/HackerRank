import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    	int t = in.nextInt();

    	for (int a = 0; a < t; a++) {
			String str = in.next(); 
			int i = 0;
			int j = str.length() - 1;

			int count = 0;
			while (i < j) {
				count += Math.abs(str.charAt(i) - str.charAt(j));
				i++;
				j--;
			}

			System.out.println(count);
    	}
    }
}