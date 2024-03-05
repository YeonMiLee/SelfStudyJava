package quiz_board;

public class Controller {
	public static void init() {
		boolean run = true;
		
		while(run) {
			int number = View.menu();
			switch(number) {
				case 1:	//게시글보기
					View.list();		
					break;
				case 2: //글작성
					View.createBoard();
					break;
				case 3:
					run = false;
					System.out.println("종료합니다.");
				
			}
		}
	}
	
}
