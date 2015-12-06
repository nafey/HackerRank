import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int t = myScan.nextInt();

        String first = myScan.next();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : first.toCharArray()) {
        	hm.put(c, 1);
        }

        for (int a = 0; a < t - 1; a++) {
    		Iterator it = hm.entrySet().iterator();

			while (it.hasNext()) {
				Map.Entry mp = (Map.Entry) it.next();
				if (mp.getValue() == 1) {
					hm.put(mp.getKey().toString().charAt(0), 0);
				}
			}

			String str = myScan.next();

			for (char c : str.toCharArray()) {
				if (hm.containsKey(c)) {
					hm.put(c, 1);
				}
			}

			it = hm.entrySet().iterator();

			List<Character> lst = new ArrayList<>();

			while (it.hasNext()) {
				Map.Entry mp = (Map.Entry) it.next();
				if (mp.getValue() == 0) {
					lst.add(mp.getKey().toString().charAt(0));
				}
			}

			for (Character c: lst) {
				hm.remove(c);
			}
        }

        System.out.println(hm.size());
    }
}