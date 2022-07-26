package com.programming;

public class A{
	public static void main(String[] args) {
		
		String reverse="oppo reno";
		
		String[] split = reverse.split(" ");
		
		
		
		for (String s : split) {
			
			char charAt = s.charAt(0);
			char upperCase = Character.toUpperCase(charAt);
			
			String string2 = s.substring(1);
			String rev=upperCase + string2 + " ";
			
			System.out.print(rev+" ");
			
		}
		
		
		
		
	}
	
}