package com.min.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// SET은 interface 이다
// 중복이 없다.
// 순서가 없다.
public class Set_Feature {
	// java.util.Set
	// Set의 하위 자식 종류
	// HashSet, AbstractSet, TreeSet, LinkedHashSet, ...
	
	public void set() {
		// <type> Generic 참조타입의 들어가는 타입을 고정하면 나오는 타입도 고정하기 위함
		Set<String> set = new HashSet<String>();
		String a = "가", b = "나", c = "다";
		String d = new String("다");
		
		set.add(a);
		set.add(b);
		set.add(c);
		
//		// 출력 : 출력을 위한 키워드 Iterator Set의 객체가 비워질때 까지 출력
//		Iterator<String> iter = set.iterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		
//		System.out.println("객체가 비워지면 iterator는 꺼낼 값이 없습니다.");
		
		set.add(d);
		System.out.println("set에 입력되어 있는 객체의 갯수 : " + set.size());
		// set.remove(c);
		set.remove("다");
		System.out.println("set에 입력되어 있는 객체의 갯수 : " + set.size());
	}
}
