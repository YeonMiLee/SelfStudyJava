package sec03.exam.Animal;

public abstract class Animal {	//추상클래스
	
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	//추상 메소드
	public abstract void sound();
}
