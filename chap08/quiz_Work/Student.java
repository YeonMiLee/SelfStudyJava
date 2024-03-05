package quiz_Work;

public class Student extends Member {
	//3.Member클래스를 상속받는 클래스
	//전공 필드 추가 + 생성자로 초기화 + 추상 메소드 오버라이딩
	
	public String major;
	
	public Student(String name, String id, String pw, String major) {
		super(name, id, pw);
		this.major = major;
	}
	//추상 메소드 오버라이딩
	@Override
	public void work() {
		System.out.println("공부를 합니다.");
	}
	@Override
	public void test() {
		System.out.println("시험을 봅니다.");
	}
	
}
