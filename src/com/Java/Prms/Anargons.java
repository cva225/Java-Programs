package com.Java.Prms;

import java.util.Arrays;

public class Anargons {

	public static void main(String[] args) {
		String s = "Siva";
		String s1 = "aivs";
		
		String k =s.toLowerCase();
		System.out.println(s.toLowerCase());
		String k1=s1.toLowerCase();
		
	char[]	m=k.toCharArray();
	char[] m1 = k1.toCharArray();
		
		
		Arrays.sort(m);
		Arrays.sort(m1);
		System.out.println(m);
		
		System.out.println(m1);

	}

}
