package com.Java.Prms;

public class LargeSmall {

	public static void main(String[] args) {
		int a[] = {22,4,555,6,777,44,33,1,0,9,88,66,55,44,66};
		int l  = a[0];
int s = a[0];
 
for (int i = 1; i < a.length; i++) {
	
	if (a[i]>l) {
		l= a[i];
		
	}else if (a[i]<i) {
		s = a[i];
		
	}
	
}
System.out.println(l);
System.out.println(s);

	}

}
