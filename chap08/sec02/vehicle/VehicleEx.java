package sec02.exam.vehicle;

public class VehicleEx {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle;		//강제 타입 변환
		
		bus.run();
		bus.checkFare();		//Bus클래스에 있는 checkFare()		
	}

}
