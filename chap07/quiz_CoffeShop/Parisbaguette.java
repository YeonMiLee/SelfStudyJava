package quiz_CoffeShop;

public class Parisbaguette  {
	//필드-product CreamDonut(cd), RedbeanBread(rb), MoccaBread(mb)
	//생성자-매개변수 3개, 인스턴스 생성
	
	Product cd;
	Product rb;
	Product mb;
	
	Parisbaguette(int p1, int p2, int p3) {
		cd = new CreamDonut(p1);
		rb = new RedbeanBread(p2);
		mb = new MoccaBread(p3);
	}
	class CreamDonut extends Product {
		CreamDonut(int price) {
			super(price);
		}
	}

	class RedbeanBread extends Product {
		RedbeanBread(int price) {
			super(price);
		}
	}

	class MoccaBread extends Product {
		MoccaBread(int price) {
			super(price);
		}
	}
}

//public Parisbaguette(Product cd, Product rb,Product mb) {
//	cd = new CreamDonut();
//	rb = new RedbeanBread();
//	mb = new MoccaBread();
//}
//
//public void CreamDonut() {
//	System.out.println("크림도넛의 가격 : " + cd);
//}
//public void RedbeanBread() {
//	System.out.println("단팥빵의 가격 : " + rb);
//}
//public void MoccaBread() {
//	System.out.println("모카빵의 가격 : " + mb);
//}


