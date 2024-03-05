package sec02.exam;

public class CarEx {
	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.run();
		
		mycar.frontLeftTire = new KumhoTire();
		mycar.frontRightTire = new KumhoTire();
		
		mycar.run();
	}

}

