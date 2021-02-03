package sec03.ex07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		int v1 = Integer.parseInt("10");
		double v2 = Double.parseDouble("3.14");
		boolean v3 = Boolean.parseBoolean("true");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		int n1 = 10;
		String v4 = String.valueOf(n1);
		System.out.println(v4);
		System.out.println(v4.getClass().getName());
	}

}
