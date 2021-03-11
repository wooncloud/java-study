package com.min.edu;

/**
 * Static으로 선언된 Member의 사용방법과 접근에 대한 연습 <br>
 * @author Woon
 */
public class MethodClass {

	public static int newCnt = 0;

	public MethodClass() {
		// 상위변수 사용.
		newCnt = newCnt + 1;
		// newCnt++;
		// newCnt += 1;
	}

	public static void makeS() {
		// print();
		makeS();
		OtherClass oc = new OtherClass();
		oc.makeO();
		oc.printO();
	}

	public static void printS() {
		// make();
		printS();
		OtherClass oc = new OtherClass();
		oc.makeO();
		oc.printO();
	}

	public void make() {
		print();
		makeS();
		OtherClass oc = new OtherClass();
		oc.makeO();
		oc.printO();
	}

	public void print() {
		make();
		printS();
		OtherClass oc = new OtherClass();
		oc.makeO();
		oc.printO();
	}
}
