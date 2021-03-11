package com.min.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Feature4 {

	public void set_remove() {

		Set<String> sets = new HashSet<String>();
		sets.add("하늘");
		sets.add("바람");
		sets.add("별");
		String re = "하늘";
		String re2 = new String("하늘");
		String re3 = "꿈";
		
		// 삭제하는 방법은 변수의 주소를 통해서 가지고 있는 값의 hashcode로 삭제함
//		sets.remove("하늘");
//		sets.remove(re);
//		sets.remove(re2);
		sets.remove(re2);
		
		// 자료구조는 주소가 아닌 값으로 가지고 있다.
		sets.add(re3);
		re3 = "자바";
		sets.remove(re3);
		
		Iterator<String> iter = sets.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
}
