package com.min.ctrl;

import com.min.edu.IArea;
import com.min.edu.Square;
import com.min.edu.Triangle;
import com.min.util.InputVal;

public final class Controller {
	// single-ton design pattern

	// 2) 자신의 객체 주소를 담을 수 있는 변수를 선언
	private static Controller instance;

	// 1) 외부에서 자신을 생성하지 못하도록 (instance 화) private 접근제한을 사용함.
	private Controller() {
		
	}

	// 3) 외부에서 기능을 노출(static)을 통해서 자신의 객체가 메모리에 있다면
	// ctrl의 변수가 null이 아니라면 생성되어 있는 주소를 전달해주고
	// 아니라면 자신이 생성해서 변수에 담은 후 주소를 전달
	public static Controller getInstance() {
		if (instance == null) {
			instance = new Controller();
		}

		return instance;
	}
	
	public IArea choiceAreaCal() {
		IArea area = null;
		
		System.out.println("1번 삼각형, 2번 사각형");
		int ch = InputVal.resultInt();
		int x, y;
		
		switch (ch) {
		case 1:
			x = InputVal.resultInt();
			y = InputVal.resultInt();
			area = new Triangle(x, y);
			break;
		case 2:
			x = InputVal.resultInt();
			y = InputVal.resultInt();
			area = new Square(x, y);
			break;
		default:
			break;
		}
		
		return area;
	}

}
