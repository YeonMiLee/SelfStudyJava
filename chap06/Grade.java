package quiz;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
	//수학, 과학, 영어 순으로 점수를 스캐너로 입력받아 Grade객체 생성하고 성적평균 출력
	//int타입의 math, science, english = private으로 선언
	//생성자와 세 과목의 평균을 리턴하는 average() 메소드 작성
					
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력>> ");
	int math = scanner.nextInt();
	int science = scanner.nextInt();
	int english = scanner.nextInt();		
	
	Grade me = new Grade(math, science, english);
	
	System.out.println("평균은: " + me.average());
	
	
	scanner.close();		
}	
	
	
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;		
	}	
	
	public int average() {
		return (math + science + english)/3;			
	}	
}





//	public class Grade{
//	private int math;
//	private int science;
//	private int english;
//	int Avg =0;
//
//	public Grade() {
//		this.math = math;
//		this.science = science;
//		this.english = english;
//	}
//	
//	
//	int average() {
//		this.math = math;
//		this.science = science;
//		this.english = english;
//		
//		Avg = (math+science+english)/3;
//		return Avg;
//	}
//	
//	
//	public int getMath() {
//		return math;
//	}
//	public void setMath(int math) {
//		this.math = math;
//	}
//	public int getScience() {
//		return science;
//	}
//	public void setScience(int science) {
//		this.science = science;
//	}
//	public int getEnglish() {
//		return english;
//	}
//	public void setEnglish(int english) {
//		this.english = english;
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		Grade grade = new Grade();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("수학 과학 영어 순으로 3개의 정수 입력하세요 : ");
//		int math = sc.nextInt();
//		grade.setMath(math);
//		int science = sc.nextInt();
//		grade.setScience(science);
//		int eng = sc.nextInt();
//		grade.setEnglish(eng);
//		
//		 
//		System.out.println("평균은 : " + grade.average());
//		
//	}

