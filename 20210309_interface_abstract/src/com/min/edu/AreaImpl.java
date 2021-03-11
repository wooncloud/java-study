package com.min.edu;

public abstract class AreaImpl implements IArea {

	protected int x;
	protected int y;
	protected double result;

	@Override
	public abstract void make();

	@Override
	public void print() {
		System.out.println("면적의 결과는? " + result);
	}

	public double getResult() {
		return result;
	}

}
