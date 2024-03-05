package sec01.exam01;

/**바깥 클래스**/
class A {
	A() { System.out.println("A 객체가 생성됨"); }
	
	/**인스턴스 멤버 클래스**/
	public class B {
		B() { System.out.println("B 객체가 생성됨"); }		//생성자
		int field1;										//인스턴스 필드
		//static int field2;							//정적필드 X
		void method1() { }								//인스턴스메소드
		//static void method2() { }						//정적메소드 X
	}
	
	/**정적 멤버 클래스**/
	static class C {
		C() { System.out.println("C 객체가 생성됨"); }		//생성자
		int field1;										//인스턴스 필드
		static int field2;								//정적필드
		void method1() { }								//인스턴스메소드
		static void method2() { }						//정적메소드
	}
	
	void method() {
		/**로컬 클래스**/
		class D {
			D() { System.out.println("D 객체가 생성됨"); }	//생성자
			int field1;									//인스턴스 필드
			//static int field2;						//정적필드 X
			void method1() { }							//인스턴스메소드
			//static void method2() { }					//정적메소드 X
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
