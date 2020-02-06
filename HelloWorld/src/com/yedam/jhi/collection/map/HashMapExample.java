package com.yedam.jhi.collection.map;
//ctrl+Shift+o
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//map: key값, value를 쌍으로 저장할수있음
public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap(); //String:key, Integer: value
		map.put("하준원", 20);
		map.put("홍성우", 30);
		map.put("윤재언", 40);
		map.put("남용희", 50);
		System.out.println(map.size());
		Integer i = map.get("하준원"); //key가 하준원인걸 가져와서 i에 담는다.
		Set<String>  set = map.keySet(); //key값을 뽑아와서 set에 담는다.
		
//		순서가 없다.(map,set 둘다)
		Iterator<String> iter = set.iterator();//반복자 뽑아옴 
		while(iter.hasNext()) { //반복자를 한번 읽어오면 읽은 반복자는 다시 읽어오지 않는다.(주의)
//			System.out.println(map.get(iter.next())); //키값기준인 map.get(iter.next()):value			
//			System.out.println(iter.next() + ", " + map.get(iter.next())); 
			String key = iter.next(); //여기에 담긴게 key
			System.out.println(key + ", " + map.get(key)); 
			
		}
		
		
		
		
		
	}//main
}//class
