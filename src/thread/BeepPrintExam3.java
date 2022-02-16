package thread;

import java.awt.Toolkit;

public class BeepPrintExam3 {

	public static void main(String[] args) {
		 
		 Thread thread = new BeepThread();//쓰레드가 생성됨
		 
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
