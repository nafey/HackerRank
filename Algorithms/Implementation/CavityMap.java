import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isCavity(int i, int j, String[] g, int n) {
        if (i == 0 || j == 0 || i == n - 1 || j == n - 1) return false;
        
        int val = Integer.parseInt(g[j].substring(i, i + 1));
        int up = Integer.parseInt(g[j - 1].substring(i, i + 1));
        int down = Integer.parseInt(g[j + 1].substring(i, i + 1));
        int left = Integer.parseInt(g[j].substring(i - 1, i));
        int right = Integer.parseInt(g[j].substring(i + 1, i + 2));
        
        if (val > up && val > down && val > right && val > left) {
            return true;
        }
		
		return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
		
		String[] grid_copy = new String[n];
		for(int i = 0; i < n; i++) {
			grid_copy[i] = grid[i];
		}
        
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (isCavity(i, j, grid, n)) {
                    grid_copy[j] = grid_copy[j].substring(0, i) + "X" + grid_copy[j].substring(i + 1, n);
                }
            }
        }
		
		for (int i = 0; i < n; i++) {
            System.out.println(grid_copy[i]);
        }
			
        
        
    }
}
