package sec03.exam.Animal;

public class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		
		System.out.println("-----");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();		//자동 타입 변환 및 재정의된 메소드 호출
		animal.sound();
		animal = new Cat();		//자동 타입 변환 및 재정의된 메소드 호출
		animal.sound();
		
		System.out.println("-----");
		
		//매개변수의 자동 타입 변환(메소드의 다형성)
		animalSound(new Dog());		//animalSound(Animal animal) 자동타입변환
		animalSound(new Cat());		//animalSound(Animal animal) 자동타입변환
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
		//재정의된 메소드 호출
	}
}
