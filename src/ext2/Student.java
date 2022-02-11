package ext2;

public class Student extends Person{

	private String studentID;//학번
	private int grade;//학년
	private double GPA;//학점
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	@Override//부모에게 받은 메소드 재정의
	public String toString() {
		return "Person [name=" + super.getName() + "], Student [studentID=" + studentID + ", grade=" + grade + ", GPA=" + GPA + "]";
	}
	
	

}
