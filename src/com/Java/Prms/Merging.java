package com.Java.Prms;

public class Merging{

	public static void main(String[] args) {
		String s = "abc";
		String l = "mnon";
		String m = "";
		int i =0,j=0,k=0;
		
		while (i<s.length()&&j<l.length()) {
			
			m = m+s.charAt(i)+l.charAt(j);
			i++;
			j++;
			
			
		}
while (i>s.length()||j<l.length()) {
			
			m = m+l.charAt(j);
			j++;
		
	
		

	}

while (i>l.length()&&j<s.length()) {
	
	m = m+s.charAt(i);
	i++;
	
	
	
}
System.out.println(m);
	}
}

	
