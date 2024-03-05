package quiz_Casher;

public class Buyer {
	Product[] cart = new Product[3];
	//카트 바구니 ... 바구니가 다 차면 새롭게 2배의 크기만큼 생성
	int money = 10000;		//초기 설정 돈 만원	
	int bonusPoint = 0;		//포인트 0
	int i;					//산 물건과 리스트 작성하기 위해 필요한 인스턴스
	
	public void buy(Product p) {	//바이 메서드를 파라미터값으로 초상 프로덕트인 p 설정
		if(money <= p.price) {		//만약 현재 소지하고 있는 돈이 물건의 가격보다 같거나 적으면
			System.out.println("잔액이 부족하여 물건을 구매하실 수 없습니다."); //문구출력
			return;		//더이상 의미가 없으므로 리턴으로 종료
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString() + "을 구입하셨습니다.");		//p인자의 물품 이름을 표시하도록 설정
		add(p);		//물거을 담아주는 함수/ add(p)형으로 아래의 함수를 적용
	}
	
	public void add(Product p) {	//물검을 담아주는 함수
		if(i >= cart.length) {		//i가 카트 인덱스까지 들어오고 설정 초기 설정3
			Product[] temp = new Product[cart.length *2];
			//템프라는 새로운 배열 인스턴스 생성, 다만 번지는 cart X2배만큼으로 설정
			System.arraycopy(cart, 0, temp, 0, cart.length);
			//복사해야할 데이타 원본, 시작인덱스, 복사받을 대상, 시작인덱스, 인덱스 길이
			cart = temp;	//마지막으로 템프애ㅔ 받은걸 다시 카트로 옮겨담기
		}
		cart[i++] = p;	//카트 [주소++1만큼 증가하고 p인자를 카트에 대입
		//주소를 넣어주니 나중에 가격 물품을 알 수 있음
		return;
	}
	
	void summary() {	//물건을 인덱스화 
		String itemList = " ";	//스트링문자하나 생성해줌
		int sum = 0;			//사용한 금액 합산위해 선언
		for(int i=0; i<cart.length; i++) {	//밖에 선언된 i와 별개.
			if(cart[i] == null) 
				break;
		//1. 장바구니에 담긴 물건들의 목록 만들어 출력
			itemList += cart[i] + ", ";
		//2. 장바구니에 담긴 물건들의 가격을 모두 더해서 출력
			sum += cart[i].price;	//합셈은 카트0번지부터 담겨져있는걸 덧셈
		}
		
		System.out.println("구입한 물건: " + itemList);
		System.out.println("사용한 금액: " + sum);
		System.out.println("보너스포인트: " + bonusPoint);
		System.out.println("남은 금액: " + money);
	}
	
	
	
	
	
}
