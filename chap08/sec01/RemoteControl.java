package sec01.exam;

public interface RemoteControl {
	//public static final 생략하더라도 컴파일 과정에서 자동으로 붙게됨
	//(인터페이스의 필드는 모두 public static final 특성을 가짐)
	
	//상수
	public static int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
