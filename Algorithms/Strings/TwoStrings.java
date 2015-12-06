import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int t = myScan.nextInt();

        for (int a = 0; a < t; a++) {
        	String first = myScan.next();
        	String second = myScan.next();

       		boolean matchFlag = false;

       		for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
		        if(first.indexOf(c) > -1 && second.indexOf(c) > -1)
		        matchFlag = true;
    		}
    		
   			if(matchFlag) {
				System.out.println("YES");
   			} else {
   				System.out.println("NO");
   			}
   		}       		
	}
}
