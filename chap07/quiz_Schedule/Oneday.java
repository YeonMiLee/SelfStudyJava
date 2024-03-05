package quiz_Schedule;

public class Oneday extends Event {		
	// 필드: title(상속), myDate date
	// 생성자: 매개변수 2개, 메소드: toString
	
	public myDate date;	

	public Oneday(String title, myDate date) {
		super(title);
		this.date = date;
	}
	
	public String toString() {
		return title + ", " + date;
//		return title + ", " + date.toString();
	}
}
