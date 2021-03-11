package com.min.cal;

import com.min.area.AreaImpl;

public class SquareChild extends AreaImpl {

	public SquareChild(double x, double y) {
		super.x = x;
		super.y = y;
		makeArea();
	}
	
	
	@Override
	public void makeArea() {
		result = x * y;
	}

}
