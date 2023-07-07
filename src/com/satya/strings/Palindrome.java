package com.satya.strings;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str = "dog";
		
		String rev = "";
		
		String msg = "";
		
		char[] arr = str.toCharArray();
	     
		for (int i = arr.length-1; i>=0; i--) {
			rev += arr[i];
			
		}
		if (rev.equals(str) ) {
			msg = "It's a Palindrome";
		}else {
			msg = "It's not Palindrome";
		}
		
		System.out.print(rev + "---" + msg);

		// hi satya.....
		
	}
}
