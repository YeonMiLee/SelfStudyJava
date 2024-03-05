package quiz;

import java.util.Scanner;

public class MemberServiceEX {

	public static void main(String[] args) {
		// Memberservice클래스 이용하여 실행클래스 구현
		// 스캐너 통해 아이디와 패스워드 입력받음
		
		MemberService memberService = new MemberService();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요.");
		String id = scanner.nextLine();
		System.out.println("패스워드를 입력해주세요.");
		String password = scanner.nextLine();
		
		boolean result = memberService.login(id, password);
		if(result) {
			System.out.println("로그인 되었습니다.");	
			memberService.logout("hong");
		} else {		
			System.out.println("id 또는 password가 올바르지 않습니다..");
		}
		
		
		
		
		
		scanner.close();

	}

	

}
