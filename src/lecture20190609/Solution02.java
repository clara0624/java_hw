package lecture20190609;

import java.util.*;

public class Solution02 {

	public static long main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
	      long n = 0;
		char[] array=Long.toString(n).toCharArray();
	      Arrays.sort(array);
	     
	      String reverse = new StringBuffer(new String(array)).reverse().toString();
	      
	      return Long.parseLong(reverse);
	  }
	

	}


