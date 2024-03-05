package sec02.exam;

public class ForVariableEx3 {

	public static void main(String[] args) {
		// 3. 33~45까지의 숫자와 그 숫자가 짝수인지 
		//    (33입니다./ 34입니다. 짝수입니다.)

				
		int i;
		
		for(i = 33; i <= 45; i++) {			
			if( i % 2 == 0) {
				System.out.println(i + "입니다. 짝수입니다.");
			} else {
				System.out.println(i + "입니다.");
				
			}
		}
	}

}
