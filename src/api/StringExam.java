package api;

import java.io.UnsupportedEncodingException;

public class StringExam {

	public static void main(String[] args) {
		//format:서식문자열을 이용해서 서식화된 문자열을 반환한다.
		int i = 123456789;
		System.out.println(String.format("%,d", i));
		System.out.println("-------------------------------");
		
		//split(구분자) 구분자를 이용하여 문자열 배열생성
		String splitStr = "boo:and:foo";
		String[] strArr = splitStr.split(":");
		System.out.println(strArr.length);//3
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);      
		System.out.println("-------------------------------");
		
		//startWith: 문자열이 지정한 문자로 시작하는지 판단 같으면 true반환, 
		//아니면false를 반환한다(대소문자구별)
		String msg = "apple";
		System.out.println(msg.startsWith("a"));
		System.out.println("-------------------------------");
		
		//isEmpty() //문자열의 길이가 0인경우에 , true를 리턴 합니다.
		String isEmpty ="";
		System.out.println(isEmpty.length() == 0);
		System.out.println(isEmpty.isEmpty());
		System.out.println("-------------------------------");
		
		//concat(String)문자열 합치기, MySQL에도 있는 명령어.
		String fStr = "Java";
		String lStr = "Programing";
		System.out.println(fStr.concat(lStr));
		System.out.println(fStr + lStr);
		System.out.println("-------------------------------");
				
		
		//다른타입을 문자열로 변환 valueOf() *중요 다알아야함*
		System.out.println(String.valueOf(false));
		System.out.println(String.valueOf(1));
		System.out.println(String.valueOf(1.));
		System.out.println(String.valueOf('a'));
		
		System.out.println("-------------------------------");
		//trim() 문자열 앞 뒤의 공백 제거
		String oldStr1 = "              자바 프로그램    ";
		System.out.println("[DEG]["+oldStr1.trim()+"]");
		System.out.println("-------------------------------");
				
		//알파벳 소대문자 변경
		//toLowerCase():소문자,
		//toUpperCAse():대문자
		String oriStr = "Java Programing";
		System.out.println(oriStr.toLowerCase());
		System.out.println(oriStr.toUpperCase());
		
		//substring() 문자열 잘라내기 *중요 많이 쓰임*
		String ssn = "880815-1234567";
		System.out.println(ssn.substring(0, 6));
		System.out.println(ssn.substring(7, ssn.length()));
		System.out.println(ssn.substring(7));
		System.out.println("-------------------------------");
		
		//replace() 문자열 대치(교체)
		String oldStr = "자바 프로그래밍 자바";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(newStr);
		System.out.println("-------------------------------");
		
		//length() 문자열 길이
		String subject2 = "자바 프로그래밍";
		System.out.println(subject2.length());
		System.out.println("-------------------------------");
		
		//indexOf(찾을 문자열) 문자열 찾기 charAt(인덱스)
		String subject1 = "자바 프로그래밍 자바";
		int idx = subject1.indexOf("바");//1 원하는게 없으면 -1결과값.
		System.out.println(idx);
		int idx1 = subject1.lastIndexOf("바");//10
		System.out.println(idx1);
		
		
		//getbytes()  바이트 계열로 변환
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		String str1 = new String(bytes1);
		System.out.println(str1);
		System.out.println("-------------------------------");
		
		
		
		try {
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println(bytes2.length);
		String str2 = new String(bytes2);
		System.out.println(str2);
		
		byte[] bytes3 = str.getBytes("UTF-8");
		System.out.println(bytes3.length);
		String str3 = new String(bytes3);
		System.out.println(str3);
		
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("-------------------------------");
		//byte[] bytes = "문자열".getBytes("UTF-8");
		//System.out.println(new String(bytes));
		
		
		//equals(other Object)문자열비교
		// == OR equals
		String strVar1 = new String("신민철");//new=새로운객체를 만들어낸다 인스턴스화시킨다.
		String strVar2 = "Abc";
		String strVar3 = "abc";
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar2 == strVar3);
		//System.out.println(strVar1.equals(strVar2));
		System.out.println("------------------------------");
		
		//System.out.println(strVar1.equals("신민철"));//1 null point exception이 발생
		System.out.println("ABC".equals(strVar2));//2
		System.out.println("ABC".equalsIgnoreCase(strVar2));//2
		
		
		//charAt(); 인덱스에 해당하는 문자[char]를 리턴한다.
		String subject = "990101-4000000";
		char charVal = subject.charAt(7);
		if((charVal-'0') % 2 == 0) {
			System.out.println("여자");
		}else {
			System.out.println("남자");
		}
		

	}

}
