package com.min.edu;

public class Square extends AreaImpl {

	public Square(int x, int y) {
		super.x = x;
		super.y = y;
	}

	@Override
	public void make() {
		super.result = x * y;
	}

}
