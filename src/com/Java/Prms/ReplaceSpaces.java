package com.Java.Prms;

public class ReplaceSpaces {

	public static void main(String[] args) {
		
		String s = "siva kumar   hari    bro";
		String m = "";
		
		char c [] = s.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if (c[i]!=' ') {
				
				m = m+c[i];
				
			}
			else m = m+"%";
			
			
		}
		
		System.out.println(m);
		
	}

}
