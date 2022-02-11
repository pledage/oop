package api;

import java.io.IOException;

public class KeyboardToStringExam {

	public static void main(String[] args) throws IOException {
		byte [] bytes = new byte [100];//buffer 크기->사용자로 부터 받는 데이타 크기
		System.out.println("입력:");
		int readByteNo = System.in.read(bytes);
		System.out.println(readByteNo);
		String str = new String(bytes, 0, readByteNo -2/*-2의 의미|r, |n*이 붙어있다.-줄바꾸고 맨앞으로가라*/);
		System.out.println("["+str+"]"); 
	}

}
