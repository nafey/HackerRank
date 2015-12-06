import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int[] root(int n) {
        double r = Math.sqrt(n);
        int row = (int) Math.floor(r);
        int col = 1;
        
        if (row * row == n) {
            col = row;            
        } else if (row * (row + 1) >= n) {
            col = row + 1;
        } else {
            col = row + 1;
            row = row +1;
        }
        
        int[] ret = new int[2];
        
        ret[0] = row;
        ret[1] = col;
        
        return ret;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        StringBuffer sb = new StringBuffer("");
        
        char[] carr = s.toCharArray();
        
        for (char c : carr) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        
        String str = sb.toString();
        
        int n = str.length();
        int[] root = root(n);
        
        int r = root[0];
        int c = root[1];
        
        String[] grid = new String[r];
        
        while (str.length() < r * c) {
           str += "-";
        }
        
        for (int i = 0; i < r; i++) {
            grid[i] = str.substring(i * c, (i + 1) * c);
        }
        
        String[] vert = new String[c];
        
        for (int i = 0; i < c; i++) {
            vert[i] = "";
            for (int j = 0; j < r; j++) {
                if (grid[j].charAt(i) != '-') {
                    vert[i] += grid[j].charAt(i);
                }
            }
        }
        
        for (String sfg : vert) {
            System.out.print(sfg + " ");
        }
        
    }
}
