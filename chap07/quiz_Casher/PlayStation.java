package quiz_Casher;

public class PlayStation extends Product {
	public PlayStation() {
		super(120);		//슈퍼생성자 가격설정
	}
	public String toString() {
		//toString이 없으면 반환할때 주소를 반환한다. return 문자열로 문자로 변환
		return "PlayStation";				
	}

}
