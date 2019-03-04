package com.Java.Prms;

public class Accurances {

	public static void main(String[] args) {
		
		String s = "sivakumar";
		char ch = 'a';
		
	int x = 0 ;
	for (int i = 0; i < s.length(); i++) {
		
		if (s.charAt(i)==ch) {
			x = x+1;
			
		}
		
	}
	System.out.println(x);
		
		
	}

}
