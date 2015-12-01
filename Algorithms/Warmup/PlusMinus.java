import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int pos = 0;
        int neg = 0;
        int zer = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg++;
            } else if (arr[i] == 0) {
                zer++;
            } else {
                pos++;
            }
        }
        
        System.out.println(((double) pos)/((double) n));
        System.out.println(((double) neg)/((double) n));
        System.out.println(((double) zer)/((double) n));
    }
}
