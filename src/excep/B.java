package excep;

public class B {

	public void throwsMethod() {
		A a =new A();
		try {
			a.throwsMethod();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("B");
		
		
	}

}
