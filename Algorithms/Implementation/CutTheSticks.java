import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int findMin(int[] n) {
        int min = 0;
        
        for(int x : n) {
            if (x <= 0) {
                continue;
            } else {
                if ((min == 0) || (x < min)) {
                    min = x;
                } 
            }
        }
        
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        
        int min = 0;
        
        do {
            int c = 0;
        
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    arr[i] -= min;
                    if (arr[i] != 0) {
                        c++;
                    }
                }
            }    
            
            if (c != 0) System.out.println(c);
            min = findMin(arr);
        } while (min != 0);
    }
}
