package com.min.edu.literal;

public class Literal_Primitive_Type {

	public static void main(String[] args) {
		byte b = 10;
		short s = 0b10;
		int i = 010;
		long l = 0x0010;

		// prefix에 변화되는 타입의 리터럴을 갖는다.
		System.out.println(b);
		System.out.println(s); // 2
		System.out.println(i); // 8
		System.out.println(l); // 16

		// -------------------
		System.out.println();
		// -------------------

		byte b2 = 10;
		short s2 = 10;
		int i2 = 10;
		long l2 = 128;

		b2 = (byte) l2;

		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(l2);

		b2 = (byte) 0b11111111;
		System.out.println(b2);

		// -------------------
		System.out.println();
		// -------------------

		double d = 3.14;
		float f = 3.14f;
		
		// -------------------
		System.out.println();
		// -------------------

		char x1 = 'A';
		char x2 = '\u0041';
		System.out.println(x1);
		System.out.println(x2);
	}

}
