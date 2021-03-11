package com.min.main;

import com.edu.util.input.ScannerInput;

public class AreaProcess {

	public static void process() {
		String str = "N";

		do {
			// 객체가 한번만 new할 수 있도록 single-ton design pattern
//			AreaFactory area = new AreaFactory();
			AreaFactory area = AreaFactory.getInstance();
			
			System.out.println("생성된 객체의 갯수 : " + AreaFactory.create);

			area.choiceArea();

			System.out.println("다른 면적도 계산 할까요? (Y / N)");
			str = ScannerInput.stringValueIn();
		} while (str.equalsIgnoreCase("Y"));
	}

}