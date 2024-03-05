package quiz;

public class Day {
		//한달의 할 일을 표현하는 클래스 작성
		//Day클래스의 객체 배열과 적절한 필드, 메소드를 작성
		//생성자>input, view, finish, run/ run에서 메뉴 출력하고 처리	
		
	   	private String work; 
	   	
	   	public void set(String work) {
	   		this.work = work; 
	   		}
	   	
	   	public String get() {
	   		return work; 
	   		}
	   	
	   	public void show() {
	   		if(work == null) 
	   			System.out.println("없습니다.");
	   		else 
	   			System.out.println(work + "입니다.");
	   	}		
}
