package abstractclass;
/**
 * 몸체 : 필드, 상수, 구현된메소드, 추상 메소드 포함
 * @author smart12
 *
 */

public abstract class Phone {
	
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
	
	//메소드
	public void turnOn() {
		System.out.println("폰전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰전원을 켭니다.");
	}
	public abstract void call(); 
	

}
