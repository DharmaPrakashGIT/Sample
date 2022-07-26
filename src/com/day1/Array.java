package com.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Array extends A{
	
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(100);
		a.add(100);
		
		System.out.println(a);
		
		Integer integer = a.get(9);
		System.out.println(integer);
		
		Integer remove = a.remove(5);
		System.out.println(remove);
		
		int indexOf = a.indexOf(100);
		System.out.println(indexOf);
		
		int lio = a.lastIndexOf(100);
		System.out.println(lio);
		
for (int i = 0; i < a.size(); i++) {
	Integer b= a.get(i);
	System.out.println(b);
	
}	

Set<Integer> b=new HashSet<>();

  b.add(200);
  b.add(100);
  b.add(80);
  
  
   b.addAll(a);
  System.out.println(b);
  
  
boolean removeAll = b.removeAll(a);
System.out.println(removeAll);
  
		
		
		
		
		
		
		
		
		
	}

}
