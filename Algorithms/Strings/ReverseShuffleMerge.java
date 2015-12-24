import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int findNextCrit(int curr, List<Integer> crits) {
        Collections.sort(crits);
        for (int i = 0; i < crits.size(); i++) {
            if (crits.get(i) > curr) {
                return crits.get(i);
            }
        }

        return -1;
    }

    public static int findNextPos(String r, int curr, int crit, String chars) {
        char crit_char = r.charAt(crit);
        chars = chars.substring(0, chars.indexOf(crit_char) + 1);

        for (int i = 0; i < chars.length(); i++) {
            for (int j = curr + 1; j <= crit; j++) {
                if (r.charAt(j) == chars.charAt(i)) return j;
            }
        }

        return -1;
    }
    
    public static void removeCritical(String r, List<Integer> crits, int rem_pos) {
        if (!crits.contains(rem_pos)) {
            char crit = r.charAt(rem_pos);
            for (int i = 0; i < crits.size(); i++) {
                if (crits.get(i) > rem_pos) {
                    if (r.charAt(crits.get(i)) == crit) {
                        crits.remove(i);
                        return;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String s = myScan.next();

        //Character frequency in the input string
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        
        //reversing the input string
        String r = new StringBuffer(s).reverse().toString();

        //find the number of crits
        int n = 0;
        
        
        Iterator it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            n += Integer.valueOf(pair.getValue().toString());
        }
        
        n = n / 2;
        
        //the crits array
        List<Integer> crits = new ArrayList<>();

        //retraversing the array to populate crit
        //also instantiating chars
        HashMap<Character, Integer> rt = new HashMap<>();
        StringBuffer charSB = new StringBuffer("");
        for (int i = 0; i < r.length(); i++) {
            char c = r.charAt(i);
            if (rt.containsKey(c)) {
                int hm_val = hm.get(c);
                int rt_val = rt.get(c);

                if (rt_val < hm_val / 2) {
                    rt.put(c, rt_val + 1);
                } else {
                    crits.add(i);
                }
            } else {
                rt.put(c, 1);
                charSB.append(c);
            }
        }

        String chars = charSB.toString();

        //Sorting chars
        char[] carr = chars.toCharArray();
        Arrays.sort(carr);
        chars = new String(carr);

        
        int pos = -1;
        
        StringBuffer ans = new StringBuffer("");
        while(ans.length() < n){
            int crit = findNextCrit(pos, crits);
            
            pos = findNextPos(r, pos, crit, chars);
            
            char rem = r.charAt(pos);

                        
            if (rt.containsKey(rem)) {
                rt.put(rem, rt.get(rem) - 1);
                if (rt.get(rem) == 0) {
                    chars = chars.replace(String.valueOf(rem), "");
                }
            }
            
            removeCritical(r, crits, pos);
            
            ans.append(rem);
        }
        
        System.out.println(ans.toString());

    }
}