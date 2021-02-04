package sec_temp.ex01;

public class arrayCopy {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}

		System.out.println("-------");
		
		for (String s : newStrArray) {
			System.out.println(s);
		}
		
	}

}
