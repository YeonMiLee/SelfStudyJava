package sec03.exam;

public class PhoneEx {
	public static void main(String[] args) {
//		Phone phone = new Phone(); ㅡ Phone class(추상클래스)는 new연산자를 이용해 객체를 만들지 못함
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();	//Phone의 메소드
		smartphone.internetSearch();
		smartphone.turnOn();	//Phone의 메소드		
	}

}
