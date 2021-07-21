package interface1;

public class Main1 {
	public static void main(String[] args) {
		//자동차 생성 및 사용
		//생성시 Car타입, Vehicle 타입 하나씩
		Car c1 = new Car("손흥민");
		Vehicle v1 = new Car("김영훈");
		
		c1.showStatus();
		c1.accel();
		c1.accel();
		c1.showStatus();
		c1.breakSpeed();
		c1.showStatus();
		c1.reFuel();
		
	}
}
