package sec03.ex02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intVal = 44032;
		char charVal = (char) intVal;
		System.out.println(charVal);
		
		long longVal = 300;
		intVal = (int) longVal;
		System.out.println(intVal);

		double dbVal = 3.14;
		intVal = (int) dbVal;
		System.out.println(intVal);

	}

}

