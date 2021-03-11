package com.min.edu;

public class ShortCirCuit {
	public void test() {
		System.out.println(isFalse() & isTrue());
		System.out.println(isFalse() && isTrue());
	}

	public void test2() {
//      System.out.println(2&2);
//      System.out.println(2&1);
//      System.out.println(1&1);
//      System.out.println(3&3);
		int n1 = 0;
		int n2 = 0;
		System.out.println((n1 = random()) & (n2 = random()));
		System.out.println(n1 + ":" + n2);
	}

	public int random() {
		int n = (int) (Math.random() * 5) + 1;
		return n;
	}

	public boolean isTrue() {
		System.out.println("나는 True");
		return true;
	}

	public boolean isFalse() {
		System.out.println("나는 False");
		return false;
	}
}
