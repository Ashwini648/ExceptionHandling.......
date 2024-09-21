package com.job2;

import com.savacc.SavingsAccount;

public class Job2 implements Runnable {

	SavingsAccount sa;

  public Job2(SavingsAccount sa) {
		super();
		this.sa = sa;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {

			sa.deposit(10);
		}
	}

}
