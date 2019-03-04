package com.Java.Prms;

public class IntToBinary {

	public static void main(String[] args) {
		String s = Integer.toBinaryString(225);
		
		String s1 ="";
		for (int i = s.length()-1; i >=0; i--) {
			
			s1= s1+s.charAt(i);
			
			
		}
		
		
		int n = Integer.parseInt(s1,2);
		
		System.out.println(n);

	}

}
