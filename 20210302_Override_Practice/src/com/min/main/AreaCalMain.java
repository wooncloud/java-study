package com.min.main;

import com.min.cal.*;

public class AreaCalMain {

	public static void main(String[] args) {
//		AreaFactory af = new AreaFactory();
//		af.choiceArea();
		
		AreaProcess.process();
	}

	public void regacy() {
		// 삼각형 계산하기
		TriangleChild triangle = new TriangleChild(3.1, 1.1);

		// 사각형 계산하기
		SquareChild square = new SquareChild(10, 2);

		// 원형 계산하기
		CircleChild circle = new CircleChild(1.0, 5);

		// ------------------------------------------

		triangle.printArea();
		circle.printArea();
		square.printArea();
	}
}
