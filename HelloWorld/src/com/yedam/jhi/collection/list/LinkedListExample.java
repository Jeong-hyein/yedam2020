package com.yedam.jhi.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime, endTime;
//		ArrayList 걸린시간
		startTime = System.nanoTime();
		for(int i =0; i<100000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간: " + (endTime - startTime));
		
//		LinkedList 걸린시간
		startTime = System.nanoTime();
		for(int i =0; i<100000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간: " + (endTime - startTime));
		
	}
}
