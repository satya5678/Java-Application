package com.satya.strings;

public class Swapping {

	
	public static void main(String[] args) {
		int x = 50;
		int y = 100;
		System.out.println("Swapping before " + x + " " + y);
		
		x = x  + y;
		y = x-y;
		
		x = x-y;
		
		System.out.println("After Swapping  " + x + " " + y);
	}
}
