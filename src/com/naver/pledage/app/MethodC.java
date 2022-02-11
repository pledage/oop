package com.naver.pledage.app;

public class MethodC extends MethodP{
	public /*void*/ MethodC() {//생성자
		//super/*.new MethodP().*/ /*객체를 인스턴스화시켰다*//*methodP*/();
		this.methodC2();
		System.out.println("methodC()");
		
		}
	@Override
	public void show() {
		System.out.println("자식메소드");
	}////
	public void methodC2() {
		
	}
	//[final]접근지정자 [static] 반환값 메소드명(파라메터,,,){//명령문}
	//객체명.메소드명(인자,,,);

}
