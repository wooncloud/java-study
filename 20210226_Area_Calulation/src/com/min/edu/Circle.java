package com.min.edu;

public class Circle implements IArea {
	
	@Override
	public double areaCal(double x, double y) {
		
		double result = x * y * PI;
		print(result);
		return result;
	}
}
