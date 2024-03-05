package quiz;

public class Quiz_Arraylotto {

	public static void main(String[] args) {
		// 1~45중 6개의 번호를 추출하는 로또번호 발생기 프로그램 작성
		// 배열의 크기 45/ 값 1~45까지 저장
		// 배열 인덱스 0~5번까지 값을 랜덤함수를 이용해서 배열 값을 교환한 후 
		// 로또번호는 인덱스 값으로 추출하여 나타내기
		
		
		int[] ball = new int[45];
		int i, n;
//		int tmp;

		for( i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}

		for( i=0; i<6; i++){
			n = (int)(Math.random()*45);
			
//			tmp = ball[i];
			ball[i] = ball[n];
//			ball[n] = tmp; // ball[i] = ball[n]
			
			for(int j=0; j<i; j++) {
				if(ball[i] == ball[j]) {
					i--;
					
					break;
				}
			}
		}
		
		for( i=0; i<6; i++){
			System.out.println("ball[" + i + "] : " + ball[i]);
		}

		
	}		

}


