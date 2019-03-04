package com.Java.Prms;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int x [] = {225,666,225,88,99,0,88,88,225,558,88,99,0};


int[] reversed = new int[x.length];
for (int i=0; i<x.length; i++) {
    reversed[i] = x[x.length - 1 - i];
}

System.out.println(Arrays.toString(reversed));

 
	}

}
