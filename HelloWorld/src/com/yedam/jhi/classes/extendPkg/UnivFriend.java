package com.yedam.jhi.classes.extendPkg;

public class UnivFriend extends Friend{
//	필드에 바로 접근 못하게한후 get,set을 사용해서 접근,출력
	private String university;

	
	public UnivFriend(String name, String phone, String university) {
		super(name, phone);
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
//	부모가 가지고 있는거랑 이거도 보겠다.
	@Override
	public void showInfo() {
//		super.showInfo();
		System.out.println("학교친구 이름은 " + super.getName());
		System.out.println("학교친구 전화번호는  " + super.getPhone());
		System.out.println("학교는 " + university);
	}
	
	
	
}
