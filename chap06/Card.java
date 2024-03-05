package quiz;

public class Card {
	//필드
	int num;
	boolean chk;
	
	//생성자
	public Card(int num, boolean chk) {
		this.num = num;
		this.chk = chk;
	}
	
	//메소드
//	public void info() {
//		if(chk == true) {			
//			System.out.println(num + "k");
//		} else {
//			System.out.println(num);
//		}
//	}
	
	public String info() {
		String str = "";
		if(chk) {
			str = num + "k";		//str = String.valueOf(num) + "k";
		} else {
			str = num + "";			//str = String.valueOf(num) + "k";
		}
		return str;
	}
}
