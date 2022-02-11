package api;

public class ClassExam {

	public static void main(String[] args) throws ClassNotFoundException {
		ClassExam ce =new ClassExam();
		System.out.println(ce.getClass());
		System.out.println(ce.getClass().getName());//메소드는 여러게 겹쳐서 쓸수있다.
		Class clazz = Class.forName("api.Counter");//내가 만든 클래스를 읽어 들인다.
		System.out.println(clazz.getName());

	}

}
