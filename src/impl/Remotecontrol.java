package impl;
/**
 * 인터페이스 구성은 상수, 8버전 이전 오직추상메소드만 사용가능하다.
 * @author smart12
 *
 */

public interface Remotecontrol {
	
	public int MAX_VOLUME = 10;
	public /*final이 자동으로 붙는다*/ int MIN_VOLUME = 0;
	
	public /*abstract를 생략해도됨*/ void trunOn();
	public void trunOff();
	public void setVolume(int volume);

}
