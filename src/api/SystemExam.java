package api;

import java.sql.Date;

/**
 * System 클래스
 * @param args
 */
public class SystemExam {
	
	public static void main(String[] args) {
		//1644552193688 그리티 표준시 초 Timestamp 라고 한다.
		long now = System.currentTimeMillis();
		System.out.println(now);
		System.out.println(new Date(0));

	}

}
