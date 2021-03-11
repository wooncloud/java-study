package com.min.edu;

public class Triangle extends AreaImpl {

	public Triangle(int x, int y) {
		super.x = x;
		super.y = y;
	}

	@Override
	public void make() {
		super.result = x * y * 0.5;
	}

}
