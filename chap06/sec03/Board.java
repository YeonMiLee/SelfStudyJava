package sec03.exam;

public class Board {
	// Board 클래스 생성자가 오버로딩 되어있는데 
	// 생성자마다 중복코딩 된 부분 this() 활용하여 중복코드 제거하기
	
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content) {
//		this.title = title;
//		this.content = content;
//		this.writer = "로그인한 회원아이디";
//		this.date = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
		}
	Board(String title, String content, String writer) {
//		this.title = title;
//		this.content = content;
//		this.writer = "로그인한 회원아이디";
//		this.date = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
		}
	Board(String title, String content, String writer, String date) {
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.date = date;
//		this.hitcount = 0;
		this(title, content, writer, date, 0);
		}
	Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		}
	
}
