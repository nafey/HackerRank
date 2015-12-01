import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean doCompare(int i, int j, String G[], String P[], int r, int  c) {
        for (int y = 0; y < r; y++) {
            if (!(P[y].equals(G[j + y].substring(i, i + c)))) return false;
        }
        
        
        return true;
    }
    
    public static boolean canCompare(int i, int j, int R, int C, int r, int c) {
        if (j >= R || j < 0) return false;
        if (i >= C || j < 0) return false;
        if (i + c > C) return false;
        if (j + r > R) return false;
        
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            
            boolean foundFlag = false;
            
            for (int j = 0; j < R; j++) {
                for (int i = 0; i < C; i++) {
                    if (G[j].substring(i, i + 1).equals(P[0].substring(0, 1))) {
                        if (canCompare(i, j, R, C, r, c)) {
                            if (doCompare(i, j, G, P, r, c)) {
                                foundFlag = true;
                            }
                        }
                    }
                }
            }
            
            if (foundFlag) System.out.println("YES");
            else  System.out.println("NO");
        }
    }
}
