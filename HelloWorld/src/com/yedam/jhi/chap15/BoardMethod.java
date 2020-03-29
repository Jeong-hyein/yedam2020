package com.yedam.jhi.chap15;

import java.util.*;

public class BoardMethod {
	static Scanner scn = new Scanner(System.in);
	static List<Board> list = new ArrayList<>();
	
	public static void addlist() {
		System.out.print("제목입력: ");
		String subject = scn.nextLine();
		System.out.print("내용입력: ");
		String content = scn.nextLine();
		System.out.print("글쓴이 입력: ");
		String writer = scn.nextLine();
		Board board = new Board(subject, content, writer);
		list.add(board);
	}
	
	public static void updatelist() {
		System.out.print("수정할 글 번호를 입력해주세요.");
		int num = scn.nextInt();
		scn.nextLine();
		System.out.print("수정할 제목을 입력해주세요: ");
		String reSubject = scn.nextLine();
		System.out.print("수정할 내용을 입력해주세요: ");
		String reContent = scn.nextLine();
		System.out.print("수정할 글쓴이를 입력해주세요: ");
		String reWriter = scn.nextLine();
		System.out.println();
		Board board = new Board(reSubject, reContent, reWriter);
		list.set(num, board);
	}
	
	public static void dellist() {
		System.out.println("삭제할 글 번호를 입력해주세요: ");
		int num = scn.nextInt();
		list.remove(num);
	}
	
	public static void listBoard() {
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(i + ": " + board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}

