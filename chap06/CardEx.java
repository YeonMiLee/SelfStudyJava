package quiz;

public class CardEx {
	public static void main(String[] args) {
		//card클래스에서 생성자 매개변수로 받아온 boolean타입 값을 if문으로 확인해서
		//true면 문자열 k와 결합, false면 숫자 그래도 출력
		//card 클래스의 필드 int num = 1; boolean chk = true;
		
		Card card1 = new Card(3,false);
		Card card2 = new Card(2,true);
		
//		card1.info();
//		card2.info();
		
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
		
	}
}

