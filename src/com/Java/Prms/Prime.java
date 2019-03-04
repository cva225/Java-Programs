package com.Java.Prms;

public class Prime {

	public static void main(String[] args) {
		String s = " ";
				
				for (int i = 1; i < 100; i++) {
					int counter = 0;
					for (int j = i; j>=1; j--) {
						
						if (i%j==0) {
							counter = counter+1;
							
						}
						
						
						
					}
					if (counter==2) 
						s = s+i+" ";
					
					
					
				}
				System.out.println(s);
			
				
	}

}
