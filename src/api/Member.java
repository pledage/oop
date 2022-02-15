package api;

public class Member implements Comparable<Member>/*type*/ {
	
	String name;
	int age;
	
	public Member(String name, int age) { //생성자 만들기
		
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Member o) {
		//return name.compareTo(o.name);
		//return o.age - age;
		return age - o.age;
	}
	
	

}
