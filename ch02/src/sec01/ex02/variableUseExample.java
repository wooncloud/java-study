package sec01.ex02;

public class variableUseExample {

	public static void main(String[] args) {
		int hour = 3, minute = 5, totalMin = 0;
		
		System.out.println(hour + "�ð� " + minute + "��");
		
		totalMin = (hour * 60) + minute;
		System.out.println("�� " + totalMin + "��");
		System.out.printf("�� %d��", totalMin);
	}
}
