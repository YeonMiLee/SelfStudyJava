package quiz_Printer;

public class LgPrint implements Printer{
	
	@Override
	public void print(String doc) {
		System.out.println("LG프린터");
		System.out.println(doc + "를 인쇄합니다.");
	}

}
