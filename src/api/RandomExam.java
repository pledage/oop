package api;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		
		Random random =new Random(System.currentTimeMillis()); //Random객체를 하나 만든다.
		//System.out.println(System.currentTimeMillis());
		for(int i = 0; i< 100; i++)
			System.out.println(random.nextInt(11)+10);
		
		
		
		//System.out.println(random.nextInt());//-21억에서 +21사이의 난수값 발생
		//System.out.println(Math.abs(random.nextInt(11)));
		//System.out.println(Math.abs(random.nextInt()));

	}

}
