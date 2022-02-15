package api;

import common.JavaUtil;

public class MathExam {

	public static void main(String[] args) {
		//10~20
	
		int num =(int) (Math.random()*11)+10;
		System.out.println("10~20사이숫자"+num);
		
		System.out.println((int)(Math.random()*11)+10);//10~20 사이 숫자
		String str = "123456";
		System.out.println(JavaUtil.nullToBlank(str).length());
		System.out.println((str == null)?"".length():str.length());
		System.out.println(JavaUtil.round(Math.random(), 2));
		
		System.out.println(Math.round(Math.random()*1000)/1000.);
		System.out.println(Math.random());

	}

}
