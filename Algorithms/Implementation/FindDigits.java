import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int n_copy = n;
            int dig = 0;
            int c = 0;
            while (n_copy != 0) {
                dig = (n_copy % 10);
                if (dig != 0) {
                    if (n % dig == 0) c++;
                }
                
                n_copy = n_copy / 10;
            }
            
            System.out.println(c);
        }
    }
}
