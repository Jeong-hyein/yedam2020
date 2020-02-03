package com.yedam.jhi.classes;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	
	public Account(String ano, String owner, int balance) { //생성자를 만듬
		super(); //부모 클래스를 호출한다는 것 없어도 상관없음
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int amount) {
		if(amount>=10 && amount <= 100000) {
			balance = balance + amount;
		} else {
			balance = balance + 0;
		}
	}
	public void withdrawBalance(int amount) {
		if (amount > 10 && amount <= 10000) {
			balance = balance - amount;
		} else {
			balance = balance - 0;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "이름: " + owner + " " +"\n 계좌번호: " + ano + " " + "\n 잔액: " + balance + " " +"\n" ;
	}

}
