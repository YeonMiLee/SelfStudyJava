package quiz_Work;

public class Controller {
	public Controller() {
		init();
	}
	public static void init() {
		boolean run = true;
		
		while(run) {
			int selectNum = View.menu();
			switch(selectNum) {
				case 1: //회원가입
					Member member = View.sign_up();					
					for(int i=0; i<Main01.members.length; i++) {
						if(Main01.members[i] == null) {
							Main01.members[i] = member;							
							break;
						}
					}
					break;
				case 2: //로그인
					String[] login = View.sign_in();							
					for(int i=0; i<Main01.members.length; i++) {
						if(Main01.members[i] == null) {
							continue;
						} else if(Main01.members[i].getId().equals(login[0])
								&& Main01.members[i].getPw().equals(login[1])) {
							Main01.members[i].work();
							Main01.members[i].test();
						}						
					}
					break;
				case 3:
					View.exit();
					break;
			}
		}
	}
}


