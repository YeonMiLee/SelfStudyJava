package quiz_Schedule;

public class Duration extends Event {
	//필드: title(상속), myDate begin, myDate end
	//생성자: 매개변수 3, 메서드 : toString
	
	myDate begin;
	myDate end;
	
	public Duration(String title, myDate begin, myDate end) {
		super(title);
		this.begin = begin;
		this.end = end;
	}
	public String toString() {
		return title + ", 시작날짜: " + begin + ", 마감날짜: " + end;
//		return title + ", 시작날짜: " + begin.toString + ", 마감날짜: " + end.toStirng;
	}
}
