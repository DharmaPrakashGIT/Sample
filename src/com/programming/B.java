package com.programming;

import java.util.ArrayList;
import java.util.List;

public class B {
	
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		
		
		List<B> list=new ArrayList<B>();
		
		B b = new B();
		b.setName("Prakash");
		b.setId(10);
		
		B b2=new B();
		b2.setId(20);
		b2.setName("devesh");
		
		String name2 = b.getName();
		System.out.println(name2);
		
		String name3 = b2.getName();
		System.out.println(name3);
		
		
		
		
		
		
	}
	
	
	
	
}