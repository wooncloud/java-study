package com.min.triangle;

public class TriangleMain {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.generateTriangle();
		
		System.out.println(); // --------------------
		
		TriangleReverce tr = new TriangleReverce();
		tr.generateTriangle();
		
		System.out.println(); // --------------------
		
		TriangleSolution ts = new TriangleSolution();
		ts.triangleThree(8);
	}

}
