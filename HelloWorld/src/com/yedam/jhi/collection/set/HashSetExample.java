package com.yedam.jhi.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> strSet = new HashSet<>();
		strSet.add("Java");
		strSet.add("Oracle");
		strSet.add("Program");
		strSet.add("Java");
		System.out.println(strSet.size()); //size: length같은 역할
		
		for(String str : strSet) {
			System.out.println(str);
		}
	}
}
