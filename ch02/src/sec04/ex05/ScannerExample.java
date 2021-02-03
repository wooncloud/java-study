package sec04.ex05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine();
			System.out.printf("입력된 문자열 : %s \n", inputData);
			if(inputData.equals("q"))
				break;
		}
		
		System.out.println("종료");
	}
}
