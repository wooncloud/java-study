package com.min.edu;

public class Triangle implements IArea {
	
	@Override
	public double areaCal(double x, double y) {
		
		double result = x * y * 0.5;
		print(result);
		return result;
	}
	
}
