package com.naver.pledage.app;

import java.util.Date;

 
public class DateExam03 {

	public static void main(String[] args) {
		Date now = new Date();// new Date는 생성자
		System.out.println(now);
		
		java.sql.Date now1 = new java.sql.Date(System.currentTimeMillis()) ;
	
		System.out.println(now1);
		
		
		}
	
	

}
