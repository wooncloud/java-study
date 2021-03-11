package com.min.edu;

public class Declaration_Main {

	public static void main(String[] args) {
		Declaration d = new Declaration();
		d.testDecla();
		
		System.out.println(d.b);
		System.out.println(d.s);
		System.out.println(d.i);
		System.out.println(d.l);
		System.out.println(d.f);
		System.out.println(d.d);
		System.out.println(d.bool);
		System.out.println((int)d.c); // \u0000
		System.out.println(d.scanner);
		System.out.println(d.saveInt);
	}

}
