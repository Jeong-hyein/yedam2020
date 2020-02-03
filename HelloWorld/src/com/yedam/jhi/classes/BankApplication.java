package com.yedam.jhi.classes;

import java.util.Scanner;

public class BankApplication {
	static Account[] acntAry = new Account[10]; // 필드 선언, 초기값은 null

	public static void main(String[] args) {
//		Account[] acntAry = new Account[10]; //배열을 매개값으로 하는거 해보기(어렵)
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("====================");
			System.out.println("1.계좌생성 2.예금 3.출금 4.계좌목록 5.계좌조회 9.종료");
			System.out.println("=====================");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine(); // 엔터처리를 위해
			if (selectNo == 1) {
				System.out.print("계좌번호를 입력: ");
				String ano = scn.nextLine();
				System.out.print("이름 입력: ");
				String owner = scn.nextLine();
				System.out.print("금액 입력: ");
				int balance = scn.nextInt();
				Account acnt = new Account(ano, owner, balance);
				for (int i = 0; i < acntAry.length; i++) {
					if (acntAry[i] == null) {
						acntAry[i] = acnt;
						break;
					}
				}
			} else if (selectNo == 2) {
				System.out.print("조회 계좌 입력: ");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo);
				System.out.print("금액 입력:");
				int amount = scn.nextInt();
				acnt.setBalance(amount);

			} else if (selectNo == 3) {
				System.out.print("조회 계좌 입력: ");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo);
				System.out.print("출금액 입력:");
				int amount = scn.nextInt();
				acnt.withdrawBalance(amount);

			} else if (selectNo == 4) {
				for (int i = 0; i < acntAry.length; i++) {
					if (acntAry[i] != null) // 값이 있는 경우만 출력
						System.out.println(acntAry[i]);
				}
			} else if (selectNo == 5) { //계좌조회
				System.out.print("조회 계좌 입력: ");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo);
				System.out.print(acnt);
				System.out.println();

			} else if (selectNo == 9) {
				run = false;
			}

		} System.out.println("종료");// while
	}// main

	public static Account findAccount(String acntNo) {
		Account acnt = null;
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] != null && acntNo.equals(acntAry[i].getAno())) { 
				acnt = acntAry[i];
			}
		}
		return acnt;
	}

}// class
