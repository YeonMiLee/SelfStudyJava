package quiz;

public class Book {
	// Book 클래스를 활용하여 2개짜리 Book 객체 배열을 만들고,
	// 사용자로부터 책의 제목과 저자를 입력 받아 배열을 완성하라.
	// String title, author; 필드구성
	// Book[]book = new Book[2]; Book 배열 선언
	// Book[i] = new Book(title, author); 배열 원소 객체 생성
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}
}
