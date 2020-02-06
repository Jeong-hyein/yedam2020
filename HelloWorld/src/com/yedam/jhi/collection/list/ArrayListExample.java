package com.yedam.jhi.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//EmpService를 구현하는게 EmpServiceImpl
//                    EmpServiceImpl2
//EmpService가 더 크다
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>(); //인터페이스:list > 구현:ArrayList
//		값을추가: add
		strList.add("하준원");
		strList.add("박규림"); //strAry[0] = "hello" 배열은 이렇게 담았지만
		strList.add("홍성우");
		System.out.println(strList.get(0)); //리스트를 출력함,  0은index
		
		strList.add(1,"이배진");
		System.out.println(strList.get(1)); //원래 박규림이엿는데 이배진이 됨, 박규림은 2로 밀림
		System.out.println("==================");
		for(int i =0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}

		strList.remove(3); //index[3]번값을 지우겠다
		System.out.println("remove(3) 이후");
//		확장된 for구문
		for(String str : strList) {
			System.out.println(str);
		}
		
		List<Integer> intList  = new LinkedList<>();
		
		
		
	}
}
