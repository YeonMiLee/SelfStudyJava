package quiz_CoffeShop;

public class CoffeeShop {
	//필드-Product a, c, ca
	//생성자-매개변수 3개
	//Americano, caffelatte, Capucchino 클래스의 인스턴스 생성
	
	Product a;
	Product c;
	Product ca;
	
	public CoffeeShop(int c1, int c2, int c3) {
		a = new Americano(c1);
		c = new Caffelatte(c2);
		ca = new Capucchino(c3);
	}
	class Capucchino extends Product {
		public Capucchino(int price) {
			super(price);
		}
	}
	class Americano extends Product {
		public Americano(int price) {
			super(price);
		}
	}
	class Caffelatte extends Product {
		public Caffelatte(int price) {
			super(price);
		}
	}
}

//public CoffeShop(Product a, Product c,Product ca) {
//	this.a = a;
//	this.c = c;
//	this.ca = ca;
//}
//
//public void Americano() {
//	System.out.println("아메리카노의 가격 : " + a);
//}
//public void Caffelatte() {
//	System.out.println("카페라떼의 가격 : " + c);
//}
//public void Capuccino() {
//	System.out.println("카푸치노의 가격 : " + ca);
//}
//
//}
