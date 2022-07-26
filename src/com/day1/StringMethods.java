package com.day1;

public class StringMethods {
	public static void main(String[] args) {
		String a="prakash";
		String a1="Prakash";
		String a2="ranjith Kumar";
		
		int length = a.length();
		System.out.println(length);
		
		String uc = a.toUpperCase();
		System.out.println(uc);
		
		String uc1 = a1.toUpperCase();
		System.out.println(uc1);
		
		int indexOf = a.indexOf('a');
		System.out.println(indexOf);
		
		int liOf = a.lastIndexOf('a');
		System.out.println(liOf);
		
		char charAt = a.charAt(0);
		System.out.println(charAt);
		
		boolean equals = a.equals(a1);
		System.out.println(equals);
		
		boolean contains = a.contains("pra");
		System.out.println(contains);
		
		boolean eic = a.equalsIgnoreCase(a1);
		System.out.println(eic);
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
