package quiz_Car;

public class CarMain {

	public static void main(String[] args) {
		//레이서 호출
		Racer man = new Racer();
		Car[] car = new Car[2];
		car[0] = new Maserati();
		car[1] = new Ferrari();
		
		for(int i=0; i<2; i++) {
			man.drive(car[i]);
		}
	}	
	
//	Car car1 = null;
//	car1 = new Maserati();
//	man.drive(car1);
//	man.drive(new Ferrari());
	
}
