package quiz_Printer;

public class PrinterEx {
	
	public static void main(String[] args) {
		String doc = "자바 이론 문서";
		
		SamsungPrint s = new SamsungPrint();
		s.print(doc);
		s.printcolor(doc);
		System.out.println();
		
		LgPrint lg = new LgPrint();
		lg.print(doc);
		System.out.println();
	}

}
