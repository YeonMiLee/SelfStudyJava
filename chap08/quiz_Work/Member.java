package quiz_Work;

public abstract class Member implements Task {
	//2.Task를 구현받은 추상 클래스
	//이름,아이디,비밀번호,position 필드 구성
	//기본 필드 초기화하는 생성자로 구성
	
	private String name;
	private String id;
	private String pw;
	public String position;
	
	public Member(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public void work() {		
	}
	@Override
	public void test() {		
	}
	

}
