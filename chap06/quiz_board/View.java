package quiz_board;

public class View {
	
	public static int menu() {		//기본 메뉴 구성
		System.out.println("환영합니다.");
		System.out.println("1. 게시글보기 2. 글 작성 3. 종료");
		System.out.println("메뉴룰 선택하세요.");
		System.out.print(">");
		int number = BoardSys.sc.nextInt();
		return number;		
	}
	public static int list() {		//게시글 보기
		System.out.println("****리스트 목록을 확인하세요****");
		for(int i= 0; i<BoardSys.board.length; i++) {
			if(BoardSys.board[i] == null) {
				continue;
			} else {
			System.out.println((i+1) + "번째 게시글 : " + BoardSys.board[i].getTitle());
			}
		}
		System.out.println("보고싶은 게시글의 번호를 선택하세요.");
		System.out.println("0번 입력시 메인 메뉴로 돌아갑니다.");
		int listtNum = BoardSys.sc.nextInt();
		return listtNum;
	}
	public static void viewContent() {	//작은메뉴	
		System.out.println("1.수정 | 2.삭제 | 3.돌아가기");
		System.out.print("선택>");				
	}
	public static Board createBoard() {		//입력받아 Board 객체로 생성하여 리턴					
		System.out.println("게시물을 작성합니다.");		
		System.out.println("제목을 입력하세요>");
		String title = BoardSys.sc.next();		
		System.out.println("작성자를 입력하세요>");		
		String name = BoardSys.sc.next();
		System.out.println("글 내용을 입력하세요>");
		String content = BoardSys.sc.next();
		System.out.println("글 수정이나 삭제시 사용할 비밀번호를 입력하세요>");
		String pw = BoardSys.sc.next();	
		System.out.println("글 등록 성공!");
		
		Board board = new Board(title, name, content, pw);		
		return board;
	}
}
