package quiz_Schedule;

public class Deadlined extends Event {
	//필드: title(상속), myDate deadline
	//생성자: 매개변수 2개, 메소드: toString

	
	myDate deadline;
	
	public Deadlined(String title, myDate deadline) {
		super(title);
		this.deadline = deadline;
	}
	public String toString() {
		return title + ", ~" + deadline;
	}
}
