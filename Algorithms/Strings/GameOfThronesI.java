import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        
        HashMap<Character,Integer> hm = new HashMap<>();
        

       	for (char c : inputString.toCharArray()) {
       		int x = 1;

	        if (hm.containsKey(c)) {
	        	x = hm.get(c) + 1;
	        }

        	hm.put(c, x);
       	}

       	int oddCount = 0;

       	Iterator it = hm.entrySet().iterator();
       	while (it.hasNext()) {
       		Map.Entry mp = (Map.Entry) it.next();
       		if (Integer.parseInt(mp.getValue().toString()) % 2 == 1) oddCount++;
       	}

       	if (oddCount == 0) {
       		System.out.println("YES");
       	} else if (oddCount == 1) {
       		if (inputString.length() % 2 == 1) {
       			System.out.println("YES");
       		} else {
       			System.out.println("NO");
       		}

       	} else {
       		System.out.println("NO");
       	}
    }
}