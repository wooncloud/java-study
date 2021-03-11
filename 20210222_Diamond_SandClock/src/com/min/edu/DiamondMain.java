package com.min.edu;

public class DiamondMain {
	
	public static void main(String[] args) {
		int stage = 7;
		
		DiamondProcess dp = new DiamondProcess();
		dp.printDiamond(stage);
		
		SandClockProcess scp = new SandClockProcess();
		scp.printSandClock(stage);
	}
}
