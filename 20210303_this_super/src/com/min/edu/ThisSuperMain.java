package com.min.edu;

public class ThisSuperMain {

	public static void main(String[] args) {
		Child c = new Child();
		c.make();
		
		Parents p = c;
		p.make();
		
		System.out.println(c.name);
	}
	
}
