package com.min.set;

import java.util.Iterator;
import java.util.Set;

public class JCF_Main {

	public static void main(String[] args) {
		funcSet4();
	}

	private static void funcSet1() {
		Set_Feature set = new Set_Feature();
		set.set();
	}

	private static void funcSet2() {
		Set_Feature2 set2 = new Set_Feature2();
		set2.setCompare();
	}

	private static void funcSet3() {
		Set_Feature3 set3 = new Set_Feature3();
		set3.inputNumSet();
		Set<Integer> returnSet = set3.getSet();

		// 출력방법 1) Set 출력의 1번째 방법 Iterator 객체를 사용하자.
		Iterator<Integer> iter = returnSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// 출력방법 2) 기본배열을 만든 후 출력하자
		Object[] iArr = (Object[]) returnSet.toArray();
//		System.out.println(Arrays.toString(iArr));
		for (Object i : iArr) {
			System.out.println((Integer) i);
		}
	}

	private static void funcSet4() {
		Set_Feature4 set4 = new Set_Feature4();
		set4.set_remove();
	}
}
