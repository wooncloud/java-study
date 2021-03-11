package com.min.alien;

public class AlienMain {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j + 1 - i < 1)
					System.out.print(j + 1 - i + 5);
				else
					System.out.print(j + 1 - i);
			}
			System.out.println(" " + (i + 1));
		}
	}

}