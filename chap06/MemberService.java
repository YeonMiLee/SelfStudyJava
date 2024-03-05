package quiz;

public class MemberService {
	// login()메소드와 logout()메소드를 선언
	// login()메소드를 호출할 때에는 매개값으로 id, pw를 제공하고
	// logout()메소드는 id만 매개값으로 제공
	// 1.login() 메소드 매개값 id=Hong/ pw=12345 = true로 리턴
	// 2.logout()메소드의 내용="로그아웃 되었습니다." 출력
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println(id + "로그아웃 되었습니다");
	}
	
}

