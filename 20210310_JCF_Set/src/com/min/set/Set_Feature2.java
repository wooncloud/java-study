package com.min.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.min.vo.VO;

public class Set_Feature2 {
	
	public void setCompare() {
		// 자료형 구조는 참조타입의 객체만을 가질 수 있다.
		// 참조타입으로 되어 있는 타입만이 Generic이 될 수 있다.
		// Set <int> -> Set <Integer> 이렇게 사용해야 함.
		Set<VO> voSet = new HashSet<VO>();
		
		VO v1 = new VO();
		VO v2 = new VO();
		
		// set에 객체를 입력
		voSet.add(v1);
		voSet.add(v2);
		
		// 객체의 갯수
		System.out.println("객체의 갯수는? : " + voSet.size());
		
		// 출력
		Iterator iter = voSet.iterator();
		VO tempVo = null;
		while (iter.hasNext()) {
			tempVo = (VO)iter.next();
		}
		
		System.out.println("V1과 같은가요?" + (v1 == tempVo));
		System.out.println("V1과 같은가요?" + (v2 == tempVo));
		
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(tempVo));
		System.out.println(System.identityHashCode(v2));
		System.out.println("결론은 비교하는 참조타입의 hashcode를 확인하여 같다면 \n"
				+ "처음의 값은 유지하고 새로운 값을 입력이 되지 않는다.");
	}
	
}
