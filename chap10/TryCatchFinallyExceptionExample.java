package sec01.exam;

public class TryCatchFinallyExceptionExample {
	public static void main(String[] args) {
		try {
			Class calzz = Class.forName("String2");			
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}

