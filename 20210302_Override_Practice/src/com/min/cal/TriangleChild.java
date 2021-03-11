package com.min.cal;

import com.min.area.AreaImpl;

public class TriangleChild extends AreaImpl {

	public TriangleChild(double x, double y) {
		super.x = x;
		super.y = y;
		makeArea();
	}
	
	@Override
	public void makeArea() {
		result = x * y * 0.5;
	}

}
