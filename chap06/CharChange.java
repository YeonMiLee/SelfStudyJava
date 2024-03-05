package quiz;

public class CharChange {
	public static void main(String[] args) {
		//Char[] 배열을 전달받아 배열 속의 공백('')을 ','로 대치하는 메소드(replace())를 작성
		//출력 This is a pencil = This,is,a,pencil
		
		char [] arr = new char [] {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		prt(arr);
		replace(arr);	
		prt(arr);		
	}
	
	
	public static void replace(char[] x) {
		for(char i=0; i<x.length; i++) {
			if(x[i] == ' ') {
				x[i] = ',';
			}
		}
	}
	
	public static void prt(char[] x) {		
		for(char i=0; i<x.length; i++) {
			System.out.print(x[i]);				
		}
		System.out.println();
	}
}
