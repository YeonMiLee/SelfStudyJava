package quiz_CoffeShop;

public class James {
	//필드-int total
	//생성자 기본, 메서드 buy()-구입합계
	
	James(){}
	
	int total;
	
	void buy(Product p) { total = total + p.price; }
	// void buy(CreamDonut c) { total = total + c.price;}
	// void buy(RedbeanBread r) { total = total + r.price;}
	// void buy(Americano a) { total = total + a.price;}	
}
