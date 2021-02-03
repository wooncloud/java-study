package sec04.ex02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {

		int keyCode;
		
		System.out.print("키코드를 입력하세요. : ");
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
	}

}
