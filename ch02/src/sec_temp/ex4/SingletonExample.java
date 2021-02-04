package sec_temp.ex4;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
	}
}
