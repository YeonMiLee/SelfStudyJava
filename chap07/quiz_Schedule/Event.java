package quiz_Schedule;

public class Event {
	//Oneday/Duration/Deadline event의 공통 멤버를 관리하는 상위 클라스
	
	public String title;
	
	public Event(String title) {
		this.title = title;		
	}
	public String toString() {
		return title;
	}
}
