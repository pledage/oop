
public class SmartPhoneExam {

	public static void main(String[] args) {
		
		//객체선언
		SmartPhone sp = null;	//null로 초기화
		
		//객체생성
		//SmartPhone() 디폴트생성자
		sp = new SmartPhone();
		
		//객체초기값
		//속성 : 객체명.속성
		sp.caseColor = "white";
		
		//객체값출력
		System.out.println("휴대폰색상:" + sp.caseColor);
		
		//객체메소드호출
		sp.takingPictures();		//SmartPhone 클래스에 있는 takingPictures메소드를 호출
		
		//가비지컬렉션호출 (.gc)
		sp = null;					//sp객체 연결을 끊기
		System.gc();
	}

}
