package quiz_board;

public class Board {
	//필드,생성자,메소드(prt)구성
	
	private String title;
	private String name;
	private String content;
	private String pw;
	
	Board(String title, String name, String content, String pw) {
		this.title = title;
		this.name = name;
		this.content = content;
		this.pw = pw;		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void prt() {
		System.out.println("제목: " + this.title);
		System.out.println("작성자: " + this.name);
		System.out.println("내용: " + this.content);		
	}
}









