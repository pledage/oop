package collection;//collection 에는 객체가 들어가야 한다.

import java.util.*;

public class HashSetExam2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 :" + set.size());

	}

}
