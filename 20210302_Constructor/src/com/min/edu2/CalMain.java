package com.min.edu2;

public class CalMain {

	public static void main(String[] args) {

		VariableObject vo1 = new VariableObject(10, 10);
		VariableObject vo2 = new VariableObject(90, 91);
		
		VariableObject voResult = IntegerCal.calculation(vo1, vo2);
		System.out.println(voResult);
	}

	/*
	public static void regacy() {
		VariableObject vo1 = new VariableObject();
		VariableObject vo2 = new VariableObject();

		vo1.x = 10;
		vo1.y = 10;

		vo2.x = 90;
		vo2.y = 91;

		System.out.printf("%d / %d\n", vo1.x, vo1.y);
		System.out.printf("%d / %d\n", vo2.x, vo2.y);
		System.out.println(vo1);
		System.out.println(vo2);

		// ----------------------------------------------------------

		int resultX = IntegerCal.addCalX(vo1.x, vo1.y, vo2.x, vo2.y);
		int resultY = IntegerCal.addCalX(vo1.x, vo1.y, vo2.x, vo2.y);

		System.out.println(resultX);
		System.out.println(resultY);

		// ----------------------------------------------------------

		int resultXX = IntegerCal.addCal(vo1.x, vo2.y);
		int resultYY = IntegerCal.addCal(vo1, vo2);

		System.out.println(resultXX);
		System.out.println(resultYY);

		// ----------------------------------------------------------
	}
	*/

}
