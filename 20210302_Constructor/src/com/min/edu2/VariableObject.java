package com.min.edu2;

public class VariableObject {

//	public int x;
//	public int y;
	
	private int x;
	private int y;

	@Override
	public String toString() {
		return "[x = " + x + ", y = " + y + "]";
	}

	public VariableObject(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// -------------------
	// getter
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
