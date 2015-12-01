import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int threes(int dig) {
        
        if (dig % 3 == 1) {
            if (dig >= 10) {
                return 2;
            }
        }
        
        if (dig % 3 == 2) {
            if (dig >= 5) {
                return 1;
            } 
        }
        
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            int threes = threes(n);
            int fives = 0;
            
            if (threes == 0) {
                if (n % 3 == 0) {
                    fives = n / 3;    
                } else {
                    fives = 0;
                }
            }
            
            if (threes == 1) {
                fives = ((n - 5) / 3);
            }
            
            if (threes == 2) {
                fives = ((n - 10) / 3);
            }
            
            StringBuilder res = new StringBuilder("");
            
            for (int i = 0; i < fives; i++){
                res.append("555");
            }
            
            for (int i = 0; i < threes; i++){
                res.append("33333");
            }
            
            if (fives == 0 && threes == 0) {
                res.append("-1");
            }
            
            System.out.println(res);
        }
        
        
    }
}
