package com.job1;

import com.savacc.SavingsAccount;

public class Job1 extends Thread {

	SavingsAccount sa;

	public Job1(SavingsAccount sa) {
		super();
		this.sa = sa;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {

			sa.withdraw(5);
		}
	}

}
