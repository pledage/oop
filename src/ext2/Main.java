package ext2;

public class Main {

	public static void main(String[] args) {
		//String name, int age, int height, int weight
		//String studentID, int grade, double gPA
		Student student1 = new Student("홍길동",10,170,50,"202202208", 1, 4.5);
		Student student2 = new Student("이순신",20,180,70,"202202208", 1, 3.5);
		System.out.println(student1.toString());
		System.out.println(student2);
		
		Teacher teacher = new Teacher("아무게", 50,170,60,"20202212");
		System.out.println(teacher);

	}

}
