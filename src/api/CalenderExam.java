package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderExam {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar rightNow = Calendar.getInstance();//현재날짜시간 2021-12-31
		Calendar rightNow2 = Calendar.getInstance();//현재날짜시간 2022-02-16
		System.out.println(format.format(rightNow.getTime()));
		
		rightNow.add(Calendar.SECOND, 60);
		System.out.println(format.format(rightNow.getTime()));
		rightNow2.roll(Calendar.SECOND, 1);
		System.out.println(format.format(rightNow2.getTime()));
		
		
		
		System.out.println(rightNow.get(Calendar.MONTH)+1+"월");
		
		rightNow.set(2021, 12-1, 31);
		//rightNow.before(rightNow2);
		//boolean tf1 = rightNow.before(rightNow2);
		boolean tf1 = rightNow.after(rightNow2);
		System.out.println(tf1);
		
		
		System.out.println(format.format(rightNow.getTime()));// 현재날짜
		//rightNow.add(Calendar.SECOND, -120);
		//rightNow.add(Calendar.DAY_OF_MONTH, 30);
		rightNow.add(Calendar.MONTH, 1);
		System.out.println(format.format(rightNow.getTime()));//120추가된 날짜
	}

}
