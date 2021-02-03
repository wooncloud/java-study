package sec01.ex02;

public class variableUseExample {

	public static void main(String[] args) {
		int hour = 3, minute = 5, totalMin = 0;
		
		System.out.println(hour + "½Ã°£ " + minute + "ºÐ");
		
		totalMin = (hour * 60) + minute;
		System.out.println("ÃÑ " + totalMin + "ºÐ");
		System.out.printf("ÃÑ %dºÐ", totalMin);
	}
}
