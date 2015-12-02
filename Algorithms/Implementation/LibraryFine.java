import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();


        if (y1 > y2) {
        	System.out.println("10000");
        	return;
        } 

        if (y2 > y1) {
        	System.out.println("0");
        	return;
        }

        if (m1 > m2) {
        	System.out.println(String.valueOf((m1 - m2) * 500));
        	return;
        }

        if (m2 > m1) {
        	System.out.println("0");
        	return;
        }

        if (d1 > d2) {
        	System.out.println(String.valueOf((d1 - d2) * 15));
        	return;	
        }

        if (d2 > d1) {
        	System.out.println("0");
        	return;
        }        

        System.out.println("0");
        return;
    }
}