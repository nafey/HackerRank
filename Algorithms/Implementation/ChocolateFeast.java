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
            int c = in.nextInt();
            int m = in.nextInt();
            
            int tot = n/c;
            int wrapper = tot;
            
            while (wrapper >= m) {
                tot += wrapper/m;
                wrapper = wrapper/m + wrapper % m;
            }
            
            System.out.println(tot);
        }
    }
}
