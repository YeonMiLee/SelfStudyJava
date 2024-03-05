package quiz_loginsys;

public class Member {
	//회원가입과 로그인 시스템(종이)
	
	private String id;
	private String pw;
	private String name;
	private String phone;

	Member(String id,String pw,String name,String phone) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;		
	}
	
	public void setid(String id) {
		this.id = id;
	}
	public String getid() {
		return id;
	}
	public void setpw(String pw) {
		this.pw = pw;
	}
	public String getpw() {
		return pw;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public String getphone() {
		return phone;
	}	
	
	public void prt() {
		System.out.println("사용자 이름: " + this.name);
		System.out.println("사용자 전화번호: " + this.phone);
	}
}
