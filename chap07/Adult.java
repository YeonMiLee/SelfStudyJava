package quiz;

public class Adult extends Person {
	
	public Adult(int age, String name, int height, int weight) {
		super(age, name, height, weight);
	}	
	
	public void set() {
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + getWeight());		
	}

//	public void set() {
//		this.age = 30;
//		this.name = "홍길동";
//		this.height = 175;
//		this.setWeight(99);
//		System.out.println("나이: " + age);
//		System.out.println("이름: " + name);
//		System.out.println("키: " + height);
//		System.out.println("몸무게: " + getWeight());		
//	}
	
	public static void main(String[] args) {
		Adult adult = new Adult(30, "홍길동", 175, 99);		
		adult.set();
		
//		Adult adult = new Adult();
//		adult.set();
	}	
}
