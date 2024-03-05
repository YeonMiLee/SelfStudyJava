package sec02.exam;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;		//자동타입변환
		parent.method1();			
		parent.method2();			//Child 클래스에서 재정의된 메소드 호출됨
		//parent.method3();			//Parent 클래스에 method3가 없어서 호출 불가능
		
	}
}
