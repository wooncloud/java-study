package com.min.edu;

import java.util.Arrays;

public class ReferenceCopy {

	/**
	 * 참조 주소를 전달하는 것.<br>
	 * 주소를 전달하면 주소를 가지고 있는 모든 곳에서 변경이 가능하다.<br>
	 * 이 변경은 주소를 가지고 있는 모든 곳에서 영향을 받는다.
	 */
	public void ShallowCopy() {
		int[] origin = { 1, 2, 3, 4 };
		int[] copy = origin; // 주소 전달

		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		System.out.println(origin == copy);

		// ----------------------------------------

		// copy의 내용을 변경했더니 origin에도 변경이 일어난다!!
		// -> Shallow Copy (얕은 복사)
		copy[3] = 0;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
	}

	/**
	 * 참조 주소를 전달하는 것이 아니라,<br>
	 * 가지고 있는 멤버 필드를 복제하여 새로운 객체를 생성하고<br>
	 * 생성된 객체의 주소를 전달.
	 */
	public void DeepCopy() {
		// 최종적으로 사용할 방법은 Clone Pattern을 사용하여 작성 할
		// 사용자 클래스를 복제하는 방법을 사용함.
		int[] origin = { 1, 2, 3, 4 };

		// 3가지가 있음.
		// 1) 배열과 같은 크기를 생성하고 heap에서 stack으로 값을 꺼낸 후, 새로운 배열에 넣어줌.
		int[] arrStack = new int[origin.length];
		for (int i = 0; i < origin.length; i++) {
			arrStack[i] = origin[i];
		}
		System.out.println(arrStack == origin);
		
		// -----------------------------------------------
		
		// 2) int의 메소드 중 clone()이라는 메소드 사용.
		// clone()은  java.lang.Object의 것.
		int[] arrClone = origin.clone();
		System.out.println(arrClone == origin);
		
		// -----------------------------------------------
		
		// 3) System 클래스를 사용하여 메모리 복제 하는 방법
		int[] arrSystem = new int[8];
		Arrays.fill(arrSystem, -1);
		Arrays.toString(arrSystem);
		System.out.println(Arrays.toString(arrSystem));
		
		System.arraycopy(origin, 0, arrSystem, 2, 3);
		System.out.println(Arrays.toString(arrSystem));
		
		// -----------------------------------------------
		
		origin[0] = 999;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(arrStack));
		System.out.println(Arrays.toString(arrClone));
		System.out.println(Arrays.toString(arrSystem));
	}

}
