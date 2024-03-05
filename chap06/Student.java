package quiz;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student() {}
	
	public Student(String name,int ban,int no,int kor,int eng,int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {		
		int sum = this.kor + this.eng + this.math;
		return sum;			
	}
	public float getaverage() {
		float avg = this.kor + this.eng + this.math/3;
		return avg;		
	}
	public void info() {
		System.out.println("이름: " + name);
		System.out.println("반: " + ban);
		System.out.println("번호: " + no);
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("총점: " + getTotal());
		System.out.println("평균: " + getaverage());
		
	}
}

