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
            int b = in.nextInt();
            int w = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            if (x > y) {
                if (x > y + z) {
                    x = y + z;
                }
            } else if (y > x) {
                if (y > x + z) {
                    y = x + z;
                }
            }

            long cost =  (long) x * (long) b + (long) y * (long) w;

            System.out.println(cost);
        }
    }
}
