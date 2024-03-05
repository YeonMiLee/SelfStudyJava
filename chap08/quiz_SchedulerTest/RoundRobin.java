package quiz_SchedulerTest;

public class RoundRobin implements Scheduler {
	//1.순서대로 배분
	//getNextCall() 상담전화를 순서대로 대기열에서 가져오기
	//sendCallToAgent() 다음 순서 상담원에게 배분
	
	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");	
	}	
	
	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");	
	}
}
