import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String str = "";
        
        for (int i = 0; i < n; i++) {
            for (int j = n - 1 - i; j > 0; j--) {
                str += " ";
            }
            
            for (int j = 1; j <= i + 1; j++) {
                str += "#";
            }
            
            System.out.println(str);
            str = "";
        }
        
    }
}
