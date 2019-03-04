package com.Java.Prms;

public class ReverseInteger {
	public static void main(String[] args) {
		
	int x = 252;
	int y= 0;
	int z=x;
	
	while (x!=0) {
		
		y= y*10+x%10;
		x=x/10;
		
		
	}
	System.out.println(y);
	
	
	if (z==y) {
		System.out.println("p");
		
	}
	else {
		System.out.println("n");
	}
	}
	
	
		
	}

