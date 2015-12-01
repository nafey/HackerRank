import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String time24(String time12) {
        String ret = "";
        String z = time12.substring(8,9);
        Integer hour = Integer.parseInt(time12.substring(0, 2));
        
        if (hour == 12) {
            if (z.equals("A")) {
                time12 = "00" + time12.substring(2);
            }
        } else {
            if (z.equals("P")) {
                time12 = Integer.toString(12 + hour) + time12.substring(2);
            }
        }
        
        ret = time12.substring(0, 8);
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        System.out.println(time24(time));
    }
}
