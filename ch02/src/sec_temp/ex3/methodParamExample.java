package sec_temp.ex3;

public class methodParamExample {

	public static int test(int... param) {

		int sum = 0;
		for (int i : param) {
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {
		int t1 = test(1, 2, 3, 4, 5, 10, 21, 30, 5156);
		System.out.println(t1);
	}

}
