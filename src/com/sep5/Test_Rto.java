package com.sep5;

import java.util.Scanner;

public class Test_Rto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();

				if(18>age) {
					
					AgetwoLow agelow=new AgetwoLow("Age is to low your not eligable");
					throw agelow;
				}
				else if(75<age) {
						
						AgetwoHigh agehigh= new AgetwoHigh ("Age is to high your not eligable");
						throw agehigh;
						
					}
				
				else {
					
					System.out.println("welcome to pune Rto");
				}
				

//				if(18>age) {
//		
//					try {
//						AgetwoLow agelow=new AgetwoLow("Age is to low your not eligable");
//						throw agelow;
//					}
//		
//					catch(AgetwoLow e){
//		
//						System.out.println("the age is low");
//					}
//				}
//		
//				else if(75<age) {
//		
//					try {
//						AgetwoHigh agehigh= new AgetwoHigh ("Age is to high your not eligable");
//						throw agehigh;
//					}
//		
//					catch(AgetwoHigh e){
//		
//						System.out.println("the age is high");
//					}
//				}
//				else {
//		
//					System.out.println("welcome to pune Rto");
//		
//				}
//
//		



	}


}


