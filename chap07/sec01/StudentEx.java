package sec01.exam;

public class StudentEx {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-123456", 1);
				
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		System.out.println("studentNo: " + student.studentNo);
	}
}

