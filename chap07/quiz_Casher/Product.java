package quiz_Casher;

public class Product {
	int price;
	int bonusPoint;
	
	public Product(int price) {
		//컨스트럭트(생성자)를 가격만 받게하고 보너스포인트는 10% 적립되도록 실행
		this.price = price;
		this.bonusPoint = (int) (price / 10);		//프라이스 금액의 10%만 쌓이게 설정		
	}
}
