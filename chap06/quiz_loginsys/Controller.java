package quiz_loginsys;

public class Controller {
	public Controller() {
		init();
	}

//	private void init() {
		public static void init() {	//메인의 시작점
		boolean run = true;
		
		while(run) {
			int selectNum = View.menu();
			switch(selectNum) {
				case 1:	//회원가입
					Member member = View.signup();
					int chk = -1;
					for(int i=0; i<LoginSys.members.length; i++) {
						if(LoginSys.members[i]==null) {
							LoginSys.members[i] = member;
							
							chk = i;
							break;
						}
					}
					if(chk == -1) {
						View.deadline();
					}
				case 2:	//로그인
					String[] account = View.Login();
					int idx = -1;
					for(int i=0; i<LoginSys.members.length; i++) {
						if(LoginSys.members[i]==null) {
							continue;
						} else if(LoginSys.members[i].getid().equals(account[0])&&(LoginSys.members[i].getpw().equals(account[1])))
							LoginSys.session = i;
						System.out.println((1+i) + "번째 회원");
						View.succes(i);
					}
					
			
			if(idx== -1) {
				System.out.println("로그인에 실패했습니다.");
				System.out.println("아이디 또는 비밀번호를 확인해주세요.");
			}
				case 3:
					run = View.programExit();
					break;
				
				case 4:	//회원조회
					for(int i=0; i<LoginSys.members.length; i++) {
						if(LoginSys.members[i]==null) {
							break;
						}
						LoginSys.members[i].prt();						
					}
				default:
					View.userfault();				
			}
		}
	}	
}
