package abstractclass;

public class PhoneExam {

	public static void main(String[] args) {
		//Phone phone = new Phone(); <- 사용할수 없다. 중요
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		//홍길동 출력해보세요
		System.out.println(smartPhone.owner);
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		
		

	}

}
