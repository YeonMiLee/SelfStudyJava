package quiz_CoffeShop;

public class Buy {
	//실행클래스
	public static void main(String[] args) {

	Parisbaguette bread = new Parisbaguette(1000,1500,2000);
	System.out.println("단팥빵의 가격: " + bread.rb.price);
	System.out.println("크림도넛의 가격:"+ bread.cd.price);
	System.out.println("모카빵의 가격:"+ bread.mb.price);
	
	CoffeeShop shop = new CoffeeShop(1000, 2000, 3000);
	System.out.println("카푸치노의 가격: "+ shop.ca.price);
	System.out.println("아메리카노의 가격: "+ shop.a.price);
	System.out.println("카페라떼의 가격: "+ shop.c.price);
	
	James jamesBread = new James();
	jamesBread.buy(bread.cd);//크림도넛 구매
	jamesBread.buy(bread.rb);//단팥빵 구매
	jamesBread.buy(bread.mb);//모카빵 구매
	System.out.println("제임스가 먹은 빵의 총 가격은? " + jamesBread.total);
	
	James jamesCoffee = new James();
	jamesCoffee.buy(shop.a);//아메리카노 구매
	jamesCoffee.buy(shop.c);//카페라테 구매
	jamesCoffee.buy(shop.ca);//카푸치노 구매 
	System.out.println("제임스가 마신 커피의 총 가격은? " + jamesCoffee.total);
	
	}
	
}
