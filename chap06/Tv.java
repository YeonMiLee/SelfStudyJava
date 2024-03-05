package quiz;

public class Tv {
	//lG에서 만든 2017년형 32인치 TV
	
	private String brand;
	private int year;
	private int inch;
	
	Tv(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.print(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}
