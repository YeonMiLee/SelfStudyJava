package quiz_SchedulerTest;

public class PriorityAllocation implements Scheduler {
	//3.우선순위에 따라 배분
	//getNextCall() 고객의 등급이 높은 고객의 전화를 먼저 가져옴
	//sendCallToAgent() 업무 skill이 가장 높은 상담원의 대기열에 앞에 우선 배분
	
	@Override
	public void getNextCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다.");	
	}	
	
	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill이 가장 높은 상담원의 대기열에 앞에 우선 배분합니다.");	
	}

}
