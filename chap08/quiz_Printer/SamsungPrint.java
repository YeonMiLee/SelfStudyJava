package quiz_Printer;

public class SamsungPrint implements ColorPrintabl {
	//Printer 인터페이스와 ColorPrintabl 인터페이스 둘 다 오버로딩 해야함
	
	//Printer 인터페이스
	@Override
	public void print(String doc) {
		System.out.println("삼성프린터");
		System.out.println(doc + "를 인쇄합니다.");
	}
	
	//ColorPrintabl 인터페이스
	@Override
	public void printcolor(String doc) {
		System.out.println("삼성프린터");
		System.out.print("컬러로 " + doc + "를 인쇄합니다.");
	}

}
