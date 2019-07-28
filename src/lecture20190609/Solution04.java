package lecture20190609;

import java.util.Arrays;

public class Solution04 {
	 public int reverseInt(int n){

	        String str = Integer.toString(n);
	        char[] c = str.toCharArray();
	        Arrays.sort(c);
	        StringBuilder sb = new StringBuilder(new String(c,0,c.length));  
	        return Integer.parseInt(((sb.reverse()).toString()));
	    }


}
