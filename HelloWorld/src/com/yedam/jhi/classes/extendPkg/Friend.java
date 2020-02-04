package com.yedam.jhi.classes.extendPkg;

public class Friend {
	private String name;
	private String phone;
//	생성자: source -> using Fields
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
//	source -> getset
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
//	source -> toString
	@Override 
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
	
	public void showInfo() {
		System.out.println("이름은 " + name);
		System.out.println("전화번호는  " + phone);

	}
	
}
