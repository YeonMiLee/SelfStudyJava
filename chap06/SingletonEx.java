package quiz;

public class SingletonEx {
	//클래스에서 생성자가 private 접근 제어가 있을 때 이 클래스의 인스턴스를 사용할 수 있도록 getinstance메소드 작성
	
	private static SingletonEx s = new SingletonEx();
    private SingletonEx(){}
    
	public static SingletonEx getInstance() {	
		return s;
	}	
    private int number;
    
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    
    public static void main(String[] args) {
		SingletonEx s = SingletonEx.getInstance();
		
		s.setNumber(100);
		System.out.println(s.getNumber());

	}
}
