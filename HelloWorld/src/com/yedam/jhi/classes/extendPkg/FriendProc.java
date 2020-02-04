//실행은 FriendMain에서 실행
package com.yedam.jhi.classes.extendPkg;

import java.util.Scanner;

public class FriendProc { // 또 하나의 라이브러리
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	public Friend getFriend(String searchName) {
		Friend friend = null;
		for (Friend f : friends) {
			if (f != null && f.getName().equals(searchName)) {
				friend = f;
			}
		}
		return friend;
	}

	public void addFriend() {
//		System.out.println("입력메뉴입니다.");
		System.out.println("1.대학친구 2.회사친구 3.그외");
		int subMenu = scn.nextInt();
		scn.nextLine();
		System.out.print("이름입력: ");
		String name = scn.nextLine();
		System.out.print("번호입력: ");
		String phone = scn.nextLine();

		Friend friend = null;
		if (subMenu == 1) { // 1) 대학친구
			System.out.println("대학입력: ");
			String univ = scn.nextLine();
			friend = new UnivFriend(name, phone, univ); // Friend가 부모라서 자식담을수잇음(자동 형변환)
		} else if (subMenu == 2) { // 2) 회사친구
			System.out.println("회사입력: ");
			String company = scn.nextLine();
			friend = new ComFriend(name, phone, company);
		} else if (subMenu == 3) { // 3) 그외 친구들.
			friend = new Friend(name, phone);
		}
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

	public void listFriend() {
//		System.out.println("리스트메뉴입니다.");
		for (Friend friend : friends) {
			if (friend != null) {
				friend.showInfo(); // 배열 크기만큼만 반복(friends), Friend타입의 friend, i=0같은거 안써도 됨
			}
		}
	}

	public void updateFriend() {
//		System.out.println("수정메뉴입니다.");
		System.out.println("찾을 이름 입력: ");
		String name = scn.nextLine();
		Friend f = getFriend(name);
		if (f == null) {
			System.out.println("조회 결과 없음");
//			return; //밑에 실행 안됨, 반환겂없으면 메소드 종료
		} else { // 값이 있으면 else 실행
			System.out.println("변경할 번호 입력: ");
			String phone = scn.nextLine();
			f.setPhone(phone);
			System.out.println("변경완료");
		}
	}

	public void delFriend() {
//		System.out.println("삭제메뉴입니다.");
		System.out.println("찾을 이름 입력: ");
		String name = scn.nextLine();
		boolean isExist = false;
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null 
					&& friends[i].getName().equals(name)) { 
//	f로 하면 주소값을 null f =null; -> 배열의 값은 변하지 않음 -> 배열로 찾아가서 삭제			
//	friends[i].getName().equals(name): getName으로 가져온 frinend[i]의 값이 name과 같은지 확인
//	getName: Friend의 메소드
				friends[i] = null;
				isExist = true;
			}
		}
		if(isExist) { //true일때
			System.out.println(("삭제되었습니다."));
		}else { //false일때
			System.out.println("해당 조건의 값이 없습니다.");
		}
	}

	public void exec() {
		while (true) {
			System.out.println("==============================");
			System.out.println("1.입력 2.리스트 3.수정 4.삭제 9.종료");
			System.out.println("==============================");
			System.out.println("메뉴선택> ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				addFriend();
			} else if (menu == 2) {
				listFriend();
			} else if (menu == 3) {
				updateFriend();
			} else if (menu == 4) {
				delFriend();
			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}// exec

}// class