package quiz_CoffeeShopEx;

public class Tea extends Beverage {
	//맴버변수
	static int amount;
	
	//Tea 생성자
	public Tea(String name) {
		super(name);
		amount += 1;
	}

	//abstract메서드 오버라이딩 해서 부모클래스에 price 값 set
	@Override
	void calcPrice() {		
		if (super.getName().equals("lemonTea")) {
			super.setPrice(1500);
		} else if (super.getName().equals("ginsengTea")) {
			super.setPrice(2500);
		} else if (super.getName().equals("redginsengTea")) {
			super.setPrice(3000);
		}
	}
}
