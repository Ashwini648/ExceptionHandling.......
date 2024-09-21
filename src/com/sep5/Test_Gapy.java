package com.sep5;

public class Test_Gapy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gpay u1=new SBI();
		
		try {
			u1.paynow(100);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("infinity");
		}
	}

}
