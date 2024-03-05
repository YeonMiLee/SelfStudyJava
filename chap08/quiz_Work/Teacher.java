package quiz_Work;

public class Teacher extends Member {
	//3.Member클래스를 상속받는 클래스
	//담당 과목 필드 추가 + 생성자로 초기화 + 추상 메소드 오버라이딩
	
	public String subject;
	
	public Teacher(String name, String id, String pw, String subject) {
		super(name, id, pw);
		this.subject = subject;
	}
	
	//추상 메소드 오버라이딩
	@Override
	public void work() {
		System.out.println("강의를 합니다.");
	}
	@Override
	public void test() {
		System.out.println("채점를 합니다.");
	}

}
