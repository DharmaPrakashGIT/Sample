package com.day1;

public class StringTypes {
	public static void main(String[] args) {


		//		Literal string
		String a="prakash";
		String b="Prakash";

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		System.out.println("===========================");


		//		Non Literal String

		String a1=new String("prakash");
		String b1=new String("prakash");

		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(b1));

//		immutable
		
		
											







	}

}
