package abstractclass;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("------------------");
		Animal animal = null;//참조형 기본값은 null값이다.-중요
		animal = new Dog();//-중요
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("------------------");
		
		//메소드 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Ham());
		
	}
	
	private static void animalSound(Animal animal) {
		animal.sound();
		
		
	}

//	private static void animalSound(Cat cat) {
//		cat.sound();
//		
//		
//	}
//
//	private static void animalSound(Dog dog) {
//		dog.sound();
//		
//	}

}
