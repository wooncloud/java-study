package com.min.cal;

import com.min.area.AreaImpl;

public class CircleChild extends AreaImpl {

	public CircleChild(double x, double y) {
		super.x = x;
		super.y = y;
		makeArea();
	}

	@Override
	public void makeArea() {
		result = x * y * PI;
	}

}
