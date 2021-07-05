 package com.newlecture.app.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
//		GList<Integer> list = new GList<>();
		List<Integer> list = new ArrayList<>(); // 별도의 식별자 할당(index) 
		list.add(3);
		list.add(5);
		list.add(6); 
		list.add(10);
		for (int i=0; i<4; i++) {
			System.out.println(list.get(i));
		}
		
		Set<Integer> set = new HashSet<>(); // 식별자가 없다. 값이 곧 식별자. 중복 제거용으로 쓰인다.
		set.add(3);
		set.add(5);
		set.add(6); 
		set.add(10);
		set.add(10);
		set.add(10);
		
		System.out.println(set.add(10)); // 이미 10이 있기 때문에 boolean false 기본 반환 타입.
		System.out.println(set.size()); // 값이 곧 식별자이기 떄문에 이미 있는 값은 받아지지 않는다.
		
		
		Map<String, Object> map = new HashMap<>(); // JavaScript의 Object와 비슷?
		map.put("kms", 0);
		map.put("pkh", 50);
		map.put("KHB", new ObjectList());
		System.out.println(map.get("pkh"));
		System.out.println(map.get("KHB"));
		
		
		
		
	}
	
	

}
