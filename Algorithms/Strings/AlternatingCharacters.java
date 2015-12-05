import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int distToAlternate(String str) {
        
        //first calc distance to ABAB    
        char next = 'A';
        int delA = 0;
        
        for (char c : str.toCharArray()) {
            if (c == next) {
                next = (next == 'A') ? 'B' : 'A';
            } else {
                delA++;
            }   
        }
        
        //next calc distance to BABA    
        next = 'B';
        int delB = 0;
        
        for (char c : str.toCharArray()) {
            if (c == next) {
                next = (next == 'A') ? 'B' : 'A';
            } else {
                delB++;
            }   
        }

        //System.out.println(delA + " " + delB);
        
        return (delA < delB) ? delA : delB;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    	int t = in.nextInt();
        
        //System.out.println(distToAlternate("BBBB"));
        
        for (int a = 0; a < t; a++) {
            String str = in.next();
            System.out.println(distToAlternate(str));
        }
    }
}