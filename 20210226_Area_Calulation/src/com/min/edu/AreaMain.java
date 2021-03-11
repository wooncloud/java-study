package com.min.edu;

public class AreaMain {

	public static void main(String[] args) {

		IArea area = new Triangle();
		area.areaCal(1.1, 2.2);

		area = new Circle();
		area.areaCal(3.3, 4.4);
	}

}
