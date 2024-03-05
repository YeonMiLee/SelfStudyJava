package quiz_Schedule;

public class myDate {
	//필드 int year, int month, int day
	//생성자: 매개변수 3개, 메소드: toString

	int year;
	int month;
	int day;
	
	public myDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString() {
		return year + "/" + month + "/" + day;
	}
}
