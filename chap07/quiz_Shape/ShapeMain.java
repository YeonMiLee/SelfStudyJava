package quiz_Shape;

public class ShapeMain {

	static void paint(Shape p) {
		//Shape을 상속받은 객체들이 매개변수로 넘어올 수 있승ㅁ
		p.draw();	//p가 가리키는 객체에 오버라이딩 된 draw() 호출
		//동적바인딩
	}
	public static void main(String[] args) {
		Line line = new Line();
		
		paint(line);	//line의 draw() 실행. "Line" 출력
		paint(new Shape());		//Shape의 draw() 실행. "Shape" 출력
		paint(new Line());		//오버라이딩된 메소드 Line의 draw() 실행
		paint(new Rect());		//오버라이딩된 메소드 Rect의 draw() 실행
		paint(new Circle());	//오버라이딩된 메소드 Circle의 draw() 실행
		
	}
}
