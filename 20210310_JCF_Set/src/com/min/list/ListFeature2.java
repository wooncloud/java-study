package com.min.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFeature2 {

	public void listSearch() {
		List<String> lists = new ArrayList<String>();
		
		String s1 = "가";
		String s2 = "나";
		String s3 = "다";
		String s4 = "라";
		String s5 = new String("가");
		
		lists.add(s1);
		lists.add(s2);
		
		System.out.println(lists.size());
		System.out.println(lists.get(0));
		
		lists.remove(0);
		System.out.println("index 0 : \t" + lists.get(0));
		
		lists.add(s3);
		lists.add(s4);
		
		System.out.println(lists.remove("다")); // true 나[0] 라[1]
		System.out.println(lists.remove("다")); // false 나[0] 라[1]
		
		System.out.println(lists.size());
		
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
		
		System.out.println(lists.indexOf("라"));
		
		// 모든 리스트는 iterator로 출력이 가능함.
		Iterator<String> iter = lists.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
