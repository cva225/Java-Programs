package com.Java.Prms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupliInArray {

	public static void main(String[] args) {
		int x [] = {225,666,225,88,99,0,88,88,225,558,88,99,0};
		
		Set a = new HashSet<>();
		List l  = new ArrayList<>();
		
		Set v = new HashSet<>();
		
		for (int i = 0; i < x.length; i++) {
			
			if (a.add(x[i])==false) {
				
				v.add(x[i]);
				l.add(x[i]);
			}
			
		}
		
		System.out.println(v);
		System.out.println(l);
	}

}
