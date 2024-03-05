package quiz_Shape;

	class Shape {	//도형의 슈퍼클래스
		public void draw() {
			System.out.println("Shape");
		}	
	}
	
	class Line extends Shape {
		public void draw() {		//메소드 오버라이딩
			System.out.println("Line");
		}
	}
	
	class Rect extends Shape {		
		public void draw() {		//메소드 오버라이딩
			System.out.println("Rect");
		}
	}
	
	class Circle extends Shape {
		public void draw() {		//메소드 오버라이딩
			System.out.println("Circle");
		}
	}
