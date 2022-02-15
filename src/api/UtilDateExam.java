package api;

import java.text.SimpleDateFormat;
import java.util.Date;//현재 시간 할때 Util 사용

public class UtilDateExam {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		now.setMonth(11);//월이 0~11월이다.
		System.out.println(now.getMonth()+1);
		
		//System.out.println(now.getYear()+1900);
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String nowStr = format.format(now);
		System.out.println(nowStr);

	}

}
