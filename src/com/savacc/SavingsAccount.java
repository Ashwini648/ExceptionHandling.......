package com.savacc;

public class SavingsAccount {

	long acno;
	String name;
	public double balance;

	@Override
	public String toString() {
		return "SavingsAccount [acno=" + acno + ", name=" + name + ", balance=" + balance + "]";
	}

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(long accountHolder, String name, double balance) {
		super();
		this.acno = accountHolder;
		this.balance = balance;
		this.name = name;

	}

	synchronized public void withdraw(int amount) {
		// TODO Auto-generated method stub

		balance = balance - amount;
	}

	synchronized public void deposit(int amount) {
		// TODO Auto-generated method stub
		balance = balance + amount;
	}

}
