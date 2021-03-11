package com.min.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// Vector, ArrayList, LinkedList
// 값의 중복이 가능함.
// 값을 입력하면 자동으로 index를 부여해 준다.
// 1[0], 2[1], 3[2] => 2번의 값을 삭제하면 -1[0], 3[1]이 됨
// 이유는 스택 구조이기 때문
public class ListFeature {

	public void listCheck() {
		List<Integer> lists = new ArrayList<Integer>();
//		Vector<Integer> v = new Vector<Integer>(5, 5);
		
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;
		Integer n4 = new Integer(30);
		
		lists.add(n1);
		lists.add(n2);
		lists.add(n3);
		
		print(lists);
		
		n3 = 40;
		// n3의 값은 기본타입인 int다.
		// 따라서 remove의 오버로딩된  함수중 index를 통해서 삭제하는 함수를 실행.
		// 하지만 현재 생성된 List객체는 10 20 30의 객체가 입력되어 있기 때문에 index번호 3은 2를 넘을 수 없음.
		// lists.remove(n3); == lists.remove(40); 이라서 IndexOutOfBoundsException 발생
//		lists.remove(n3);
		Integer r = 30;
		lists.remove(r); // auto boxing과 auto unboxing은 연산과 선언에서만 발생됨
		
		print(lists);
	}
	
	private void print(List<Integer> lists) {
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
		System.out.println();
	}

}
