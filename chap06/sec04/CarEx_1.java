package sec04.exam;

public class CarEx_1 {

	public static void main(String[] args) {
		Car_1 myCar = new Car_1();
		
		myCar.keyTurnOn();
		myCar.run();
		
		int speed = myCar.getSpeed();
		System.out.println("현재속도: " + speed + "km/h)");

		}

}
