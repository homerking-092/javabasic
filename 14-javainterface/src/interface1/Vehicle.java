package interface1;

//인터페이스는 interface 선언을 사용한다
//내부에는 상수 변수, 추상 메서드만을 선언할 수 있다
//애초에 구현(implements)을 전제로 설계되기 때문에
//일반 변수, 메서드를 내부에 선언할 수 없다

public interface Vehicle {
	//최대 연료량
	int MAX_GAS = 100;
	
	//탈 것이라면 가지고 있을 공통적 기능을 전부 추상메서드로 작성
	//{
	//		실행문...
	//
	//}
	//부분 없이 작성
	///추상메서드들
	public void accel();		//가속
	public void breakSpeed();	//감속
	public void reFuel();		//주유
	public void showStatus();	//계기판 조회
}
