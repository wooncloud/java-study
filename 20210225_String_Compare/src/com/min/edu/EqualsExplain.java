package com.min.edu;

public class EqualsExplain {
	
	/**
	 * equals() 부모의 메소드 객체가 생성이 되면 hashcode 만들어짐. Object가 가지고 있음.<br>
	 * String은 객체가 만들어 질때, 사용되는 객체의 codepoint를 사용하여 object가 부여한 hashcode를 재정의한다.<br>
	 * => equals and hashcode override
	 */
	public void StringEquals() {
		String str1 = "Happy";
		String str2 = "happy";
		
		System.out.println(str1 == str2);
		
		// 주소를 비교하지 말고 문자열로 재정의한 hashcode로 비교하자. (더 정확함)
		// 대소문자를 구분함 
		boolean isc1 = str1.equals(str2);
		System.out.println(isc1);
		
		// 대소문자를 구분하지 않고 비교 대상을 
		boolean isc2 = str1.equalsIgnoreCase(str2);
		System.out.println(isc2);
	}
}
