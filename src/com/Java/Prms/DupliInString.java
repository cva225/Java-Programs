package com.Java.Prms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupliInString{

	public static void main(String[] args) {
		
		Set m = new HashSet<>();
		
		List l = new ArrayList<>();
		
		
		String s = "sivakumarMannepalli";
		
		char v [] = s.toCharArray();
	for (int i = 0; i < v.length; i++) {
		
		if (m.add(v[i])==false) {
			
			l.add(v[i]);
			
		}
		
	}
	System.out.println(l);
		
		
	}

}
