package quiz_Work;

public class View {
	//4.메인 메뉴 구성
	//회원가입, 로그인, 프로그램 종료
	
	//메인메뉴
	public static int menu() {
		System.out.println("학사 정보 관리 시스템");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");	
		int selectNum = Main01.sc.nextInt();
		return selectNum;
	}
	
	//회원가입
	public static Member sign_up() {
		Member member = null;
		
		System.out.println("회원가입을 진행합니다.");		
		System.out.println("ID를 입력하세요.");
		String id = Main01.sc.next();
		
		System.out.println("비밀번호를 입력하세요.");
		String pw = Main01.sc.next();
		
		System.out.println("이름을 입력하세요.");
		String name = Main01.sc.next();
		
		System.out.println("1. 선생님 | 2. 학생");		
		int position = Integer.parseInt(Main01.sc.next());
		
		if(position == 1) {
			System.out.println("담당과목을 입력하세요.");
			String subject = Main01.sc.next();
			member = new Teacher(name, id, pw, subject);
		} else if (position == 2) {
			System.out.println("전공을 입력하세요.");
			String major = Main01.sc.next();
			member = new Student(name, id, pw, major);
		}		
		return member;		
	}
	
	//로그인
	public static String[] sign_in() {
		String login[] = new String[2];	
		
		System.out.println("로그인을 진행합니다.");		
		System.out.println("ID를 입력하세요.");
		login[0] = Main01.sc.next();
		System.out.println("비밀번호를 입력하세요.");	
		login[1] = Main01.sc.next();
		
		return login;
	}
	
	//프로그램 종료
	public static boolean exit() {
		do {
			String end = Main01.sc.nextLine();
			if(end.equals("y") || end.equals("Y")) {
				System.out.println("프로그램을 종료합니다.");
				return false;				
			} else if(end.equals("n") || end.equals("N")) {
				System.out.println("프로그램을 종료하지 않겠습니다. 되돌아갑니다.");
				return true;
			} else { 
				System.out.println("되돌아갑니다.");	
			}
			System.out.println("종료하시겠습니까? (y/n)");
		} while(true);
	}
	
//	public static boolean exit() {
//		System.out.println("프로그램을 종료하시겠습니까? (y/n)");
//		String exitAnswer = Main01.sc.nextLine();
//		
//		if(exitAnswer.equals("Y") || exitAnswer.equals("y")) {
//			System.out.println("프로그램을 종료합니다.");
//			return true;
//		}else if(exitAnswer.equals("N") || exitAnswer.equals("n")) {
//			 System.out.println("프로그램을 종료하지 않습니다.");
//			return false;
//		}else {
//			userError();
//			return false;
//		}
//	}
//	
//	public static void userError() {
//		System.out.println("잘못 입력했습니다.");
//		System.out.println("다시 확인해 주세요.");		
//	}
}
