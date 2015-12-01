import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static char rotate(char c, int rot) {
        if (c <= 90 && c >= 65) {
            if (c + rot > 90) {
                return (char)((c + rot - 90) + 64);
            } else {
                return (char)(c + (char)rot);      
            }
        } else if (c >= 97 && c <= 122) {
            if (c + rot > 122) {
                return (char)((c + rot - 122) + 96);
            } else {
                return (char)(c + (char)rot);      
            }
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        
        k = k % 26;
        
        char[] arr  = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rotate(arr[i], k);
        }
        
        System.out.println(String.valueOf(arr));
    }
}
