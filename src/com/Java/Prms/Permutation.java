package com.Java.Prms;

public class Permutation {
	
	
	public static void m1(String str , String per) {
		
if (str.length()==0) {
	
	System.out.println(per);
	
}

for (int i = 0; i < str.length(); i++) {
	
	char c = str.charAt(i);
	String rem = str.substring(0,i)+str.substring(i+1);
	m1(rem, per+c);
	
}
	}

	public static void main(String[] args) {
		
		m1("abc", "");
		
	}

}
