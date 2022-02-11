
public class SmartPhoneExam3 {

	public static void main(String[] args) {
		
		//객체선언 및 생성
		//new 객체생성하면 sp(객체)를 인스턴스화한다.
		SmartPhone sp = new SmartPhone(null, null, null, null, "010-8403-0108");
		SmartPhone sp2 = new SmartPhone();
		
		//객체초기값
		//속성 : 객체명.속성
		sp.caseColor = "white";
		sp2.caseColor = "black";
		
		//객체값출력
		System.out.println("sp휴대폰색상:" + sp.caseColor);
		System.out.println("sp전화번호:" + sp.phoneNumber);
		System.out.println("sp2휴대폰색상:" + sp2.caseColor);
		System.out.println("sp2전화번호:" + sp2.phoneNumber);
		
		//가비지컬렉션호출 (.gc)
		sp = sp2 = null;					//sp객체 연결을 끊기
		System.gc();
	}

}
