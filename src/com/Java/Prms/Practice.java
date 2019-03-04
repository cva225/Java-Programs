package com.Java.Prms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice {

	public static void m1(int k, int l) {
		int x = 0;
		int y =1;
		int n = 0;
		List m = new ArrayList();
		for (int i = 1; i < 50; i++) {
			n = x+y;
		         if (k<n&&l>=n) {
			
				        if (n%2!=0) {
					         m.add(n);
				            }
				        }
		         x=y;
			    y=n;
			    }
		
	if (m.isEmpty()) {
		System.out.println("0");
	}
	else {
		 System.out.println(m.get(m.size()-1));
		 }
			}
				
public static void main(String[] args) {
		m1(4000,11000);
	}

}
