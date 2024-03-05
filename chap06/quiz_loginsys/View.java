package quiz_loginsys;

public class View {
	
	public static int menu() {
		System.out.print("MIT 사이트에 오신 것을 환영합니다.");
		System.out.print("1. 회원가입");
		System.out.print("2. 로그인");
		System.out.print("3. 프로그램 종료");
		System.out.print("선택>");		
		int selectNum = LoginSys.scan.nextInt();
		return selectNum;		
	}
	
	public static Member signup() {		
		System.out.println("회원가입을 합니다.");
		
		System.out.println("아이디를 입력하세요.");
		String id = LoginSys.scan.next();		
		
		System.out.println("비밀번호를 입력하세요.");
		String pw = LoginSys.scan.next();	
		
		System.out.println("이름을 입력하세요.");
		String name = LoginSys.scan.next();	
		
		System.out.println("전화번호를 입력하세요.");
		String phone = LoginSys.scan.next();		
		
		Member members = new Member(id,pw,name,phone);
		return members;
	}
		
	public static String[] Login() {
		String account[] = new String[2];
		
		System.out.println("로그인합니다.");
		
		System.out.print("아이디를 입력하세요.");
		account[0] = LoginSys.scan.next();
		
		System.out.print("비밀번호를 입력하세요.");
		account[1] = LoginSys.scan.next();
		
		return account;		
	}
	
	public static void succes(int i) {
		System.out.println("로그인에 성공했습니다.");
		LoginSys.members[i].prt();
		//LoginSys클래스에서 생성해 놓은 Member클래스 객체
	}
	
	public static void deadline() {
		System.out.println("회원가입이 마감되었습니다.");
		System.out.println("나중에 다시 찾아와 주십시오.");
	}
	
//	public static void programExit() {
//		System.out.println("종료하시겠습니까? (y/n)");
//		String YN = LoginSys.scan.next();		
//		if(YN=="y" || YN=="Y") {
//			System.out.println("프로그램을 종료합니다.");
//		} else if(YN=="n" || YN=="N") {
//			menu();
//		}		
//	}	
	public static boolean programExit() {
		do {
			String endCode = LoginSys.scan.nextLine();
			if(endCode.equals("y") || endCode.equals("Y")) {
				System.out.println("프로그램을 종료합니다.");
				return false;
				
			}else if(endCode.equals("n") || endCode.equals("N")){
				System.out.println("프로그램을 종료하지 않겠습니다. 되돌아갑니다.");
				return true;
			}else { 
				System.out.println("^^");	
			}
			System.out.println("종료하시겠습니까? (y/n)");
		}while(true);
	}
	
	public static void userfault() {
		System.out.println("로그인에 실패했습니다.");
		System.out.println("아이디 또는 비밀번호를 확인해주세요.");
	}
	
	
}
