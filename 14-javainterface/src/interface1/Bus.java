package interface1;

public class Bus implements Vehicle {
	
	private int speed;
	private int fuel;
	private int number;
	
	public Bus(int number) {
		this.speed = 0;
		this.fuel = MAX_GAS;
		this.number = number;
	}

	@Override
	public void accel() {
		//한번 가속시 스피드 + 20
		if (speed + 20 > 100) {
			speed = 100;
			System.out.println("현재 최고 속도입니다");
		}else {
			speed += 20;
			System.out.println("속도가 20 증가했습니다");
		}
		fuel -= 5;
		
	}

	@Override
	public void breakSpeed() {
		if (speed - 20 < 0) {
			speed = 0;
		}else {
			speed -= 20;
		}
		System.out.println("속도가 20 감소했습니다");
	}

	@Override
	public void reFuel() {
		if (fuel + 20 > MAX_GAS) {
			fuel = MAX_GAS;
			System.out.println("연료가 만땅입니다");
		}else {
			fuel += 20;
			System.out.println("연료를 20만큼 채웠습니다");
		}
	}

	@Override
	public void showStatus() {
		System.out.println("버스 번호: " + number + "번버스");
		System.out.println("현재 속도: " + speed);
		System.out.println("현재 연료량: " + fuel);
		System.out.println();
	}

}
