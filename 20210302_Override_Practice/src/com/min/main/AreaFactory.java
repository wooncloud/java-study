package com.min.main;

import com.edu.util.input.*;
import com.min.cal.*;
import com.min.area.AreaImpl;

public class AreaFactory {

	public static int create = 0;

	private static AreaFactory instance;

	private AreaFactory() {
		create++;
	}
	
	// 싱글턴 디자인 패턴
	public static AreaFactory getInstance() {
		if(instance == null) {
			instance = new AreaFactory();
		}
		return instance;
	}

	public void choiceArea() {
		System.out.println("1.삼각형\t2.사각형\t3.원형");
		int key = ScanInputInterger.intergerValueIn();

		// 한 객체로 모두 면적을 구하기 위한 그 단 하나의 객체
		AreaImpl area = null;

		// 가로세로의 값을 입력
		System.out.println("[가로 값 입력]");
		double x = ScannerInput.doubleValueIn();
		System.out.println("[세로 값 입력]");
		double y = ScannerInput.doubleValueIn();

		switch (key) {
		case 1:
			area = new TriangleChild(x, y);
			break;
		case 2:
			area = new SquareChild(x, y);
			break;
		case 3:
			area = new CircleChild(x, y);
			break;
		default:
			System.out.println("아직 미개발 면적 계산법 입니다.");
			break;
		}

		area.printArea();
	}
}
