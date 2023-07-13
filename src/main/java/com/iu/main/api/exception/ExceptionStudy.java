package com.iu.main.api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionStudy {
	
	public void s3() throws Exception {
		//유치원입학전 3-4
		int num1=40;
		int num2=20;
		
		int result = num1+num2;
		if(result>99) {
			//throw new MyException();
			throw new Exception();
		}
		
		result = num2-num1;
		if(result<0) {
			throw new MyException("그런거 몰라요");
		}
		
	}
	
	public void s2() throws Exception {
		int num=10;
		int num2=0;
		System.out.println(num/num2);
		
	}
	
	public void s1() {
		Scanner sc = new Scanner(System.in);
		int num=26;
		int result=0;
		System.out.println("숫자를 입력");
		try {
			int num2 = sc.nextInt();
			 //throw new InputMismatchException();
			
			result = num/num2;
			 //throw new ArithmeticException();
		 
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Result : "+result);
		
		
	}

}
