package com.satya.arrays;

import java.util.HashSet;
import java.util.Set;

public class printIntersection {
	public static void main(String[] args) {
		
		int[] arr1 = {80,10,12,2,35,60};
		int[] arr2 = {80,60,8,9,10};
		
		printIntersectio(arr1, arr2);
		
	}
	
	static void printIntersectio(int[] arr1, int[] arr2) {
		
		Set<Integer> s = new HashSet<>();
		
		for(int i = 0; i< arr1.length; i++) {
			s.add(arr1[i]);
		}
		
		for(int i = 0; i< arr2.length; i++) {
			if(s.contains(arr2[i])) {
				System.out.println(arr2[i] + " ");
			}
		}
				
	}

}
