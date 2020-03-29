package com.yedam.jhi.chap15;

import java.util.*;

public class BoardMain extends BoardMethod{
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
//		BoardMethod bm = new BoardMethod();
		while (true) {
			System.out.println("=====================================");
			System.out.println("1.등록  2.수정  3.삭제  4.리스트  5.종료");
			System.out.println("=====================================");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();

//			부모의 메소드가 static 이여야 사용가능
			if (menu == 1) {
				addlist();
//				System.out.print("제목입력: ");
//				String subject = scn.nextLine();
//				System.out.print("내용입력: ");
//				String content = scn.nextLine();
//				System.out.print("글쓴이 입력: ");
//				String writer = scn.nextLine();
//				Board board = new Board(subject, content, writer);
//				list.add(board);
				
			} else if (menu == 2) {
				updatelist();
//				System.out.print("수정할 글 번호를 입력해주세요.");
//				int num = scn.nextInt();
//				scn.nextLine();
//				System.out.print("수정할 제목을 입력해주세요: ");
//				String reSubject = scn.nextLine();
//				System.out.print("수정할 내용을 입력해주세요: ");
//				String reContent = scn.nextLine();
//				System.out.print("수정할 글쓴이를 입력해주세요: ");
//				String reWriter = scn.nextLine();
//				System.out.println();
//				Board board = new Board(reSubject, reContent, reWriter);
//				list.set(num, board);
			} else if (menu == 3) { // 삭제
				dellist();
//				System.out.println("삭제할 글 번호를 입력해주세요: ");
//				int num = scn.nextInt();
//				list.remove(num);
			} else if (menu == 4) { // 리스트
				listBoard();
//				for (int i = 0; i < list.size(); i++) {
//					Board board = list.get(i);
//					System.out.println(i + ": " + board.subject + "\t" + board.content + "\t" + board.writer);
//				}
			} else if (menu == 5) {
				break;
			}

		}
		System.out.println("프로그램 종료");
	}
}
