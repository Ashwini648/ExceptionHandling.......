package com.main;

import com.job1.Job1;
import com.job2.Job2;
import com.savacc.SavingsAccount;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SavingsAccount obj = new SavingsAccount(4567878,"AShwini Bondre",500);
		Job1 obj1=new Job1(obj);

		Job2 obj2=new Job2(obj);

		Thread t1=new Thread(obj2);
		
		obj1.start();
		t1.start();
		
		obj1.join();
		t1.join();
		System.out.println(obj.balance);
		
		
		
		
//		try {
//			obj1.join();
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
////		System.out.println(obj.toString());
//		System.out.println(obj.balance);
//		
		
		obj1.setPriority(Thread.MAX_PRIORITY); // Set obj1 as high priority
		t1.setPriority(Thread.MIN_PRIORITY);   // Set t1 as low priority
		System.out.println( );
		System.out.println("*****USing prioprity Method*****");  
		System.out.println(obj.balance);

		
	}

}
