package com.day1;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter ur id:");
		int stdId = s.nextInt();
		System.out.println("enter ur name:");
		String stdname = s.next();
		System.out.println("enter ur tamil mark:");
		byte tamil = s.nextByte();
		System.out.println("enter ur english mark:");
		byte english = s.nextByte();
		System.out.println("enter ur maths mark:");
		byte maths = s.nextByte();
		System.out.println("enter ur scince mark:");
		byte science = s.nextByte();
		System.out.println("enter ur social mark");
		byte socialScience = s.nextByte();
		
		
		int a=tamil+english+maths+science+socialScience;
		
		System.out.println("total Marks:"+a);
		System.out.println("average mark is:"+a);
	}
	
	
}
