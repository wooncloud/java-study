package com.min.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 입력시 put, get(키 객체)
public class MapFeature {

	public void mapCheck() {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("가", 10);
		map.put("나", 20);
		map.put("다", 30);
		map.put("다", 40);
		map.put("라", 50);
		map.put("마", 60);
		map.put("바", 70);
		map.put("사", 80);

		System.out.println(map.get("다"));
	}

	public void mapUse() {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("가", 10);
		map.put("나", 20);
		map.put("다", 30);
		map.put("다", 40);

		System.out.println("값을 가져오기");
		System.out.println("값 : " + map.get("다"));
		System.out.println();
		
		// Map은 반드시 키로만 삭제가 가능하고 삭제하면 가지고 있는 value를 반환해준다.
		System.out.println("map.remove(키) : " + map.remove("가"));
		System.out.println();
		
		// 가지고 있는 키워드 value가 있는지 없는지 확인
		System.out.println("키 여부 확인" + map.containsKey("다"));
		System.out.println("값 여부 확인" + map.containsValue(40));
		System.out.println();
		
		int vv =1000;
		Integer vi = 1000;
		System.out.println("int 값 여부 확인" + map.containsValue(vv));
		System.out.println("Integer 값 여부 확인" + map.containsValue(vi));
		
		System.out.println();
		
		// 만약에 map에 있는 전체 겂울 출력하고 싶다면
		// 1) key만을 추출해서 Set타입으로 만든다.
		// 2) Iterator 타입으로 만든다.
		// 3) while 출력할 때 Key로 Map의 값을 추출
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String keyString = iter.next();
			System.out.printf("%s : %d\n", keyString, map.get(keyString));
		}
	}
}
