package com.min.main;

import com.min.ctrl.Controller;
import com.min.edu.IArea;

public class AreaMain {

	public static void main(String[] args) {

		Controller ctrl = Controller.getInstance();
		IArea area = ctrl.choiceAreaCal();
		
		
		if (area == null) {
			System.out.println("개발중 입니다.");
		}
		else {
			area.make();
			area.print();
			area.message();
		}
	}

}
