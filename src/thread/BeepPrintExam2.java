package thread;

import java.awt.Toolkit;

public class BeepPrintExam2 {

	public static void main(String[] args) {
		 Runnable beepTask = new BeepTask();
		 Thread thread = new Thread(beepTask);//쓰레드가 생성됨
		 
		 thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
			
		}

	}

}
