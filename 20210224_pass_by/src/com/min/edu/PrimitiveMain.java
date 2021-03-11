package com.min.edu;

public class PrimitiveMain {

	public static void main(String[] args) {
		ProcessClass pcc = new ProcessClass();
		int n = 11;
		String s = "원본";
		pcc.primitive(n, s);
		
		System.out.printf("primitive에서 변경이 되었을까? : %d %s\n", n, s);
	}

}
