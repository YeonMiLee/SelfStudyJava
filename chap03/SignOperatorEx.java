package sec02.exam;

public class SignOperatorEx {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		byte b = 100;
		//byte result3 = -b;      byte 타입 값을 부호 연산하면 int 타입 값으로 바뀌므로			
		int result3 = -b;
		System.out.println("result3=" + result3);
		
	}

}
