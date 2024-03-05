package quiz_DaoExample;

public class DaoExample {
	//dbWork()메서드는 OracleDao와 MySqlDao객체를 매개값으로 주고 호출
	//dbWork()메서드는 두 객체를 모두 매개값으로 받기 위해 DataAccessObject 타입의 매개변수 가지고 있음
	//DataAccessObject 인터페이스/ OracleDao,MySqlDao 구현 클래스 작성 (DaoExample 코드 제시)
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();		
	}
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}
