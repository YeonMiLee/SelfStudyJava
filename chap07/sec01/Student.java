package sec01.exam;

public class Student extends People {
	//필드
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	//자식 생성자의 맨 첫 줄에서 부모 생성자의 생성자 호출
		this.studentNo = studentNo;
	}

}
