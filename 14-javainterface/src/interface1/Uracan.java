package interface1;

public class Uracan implements Vehicle {
	private String country;
	private int date;
	private int fuel;
	private int speed;
	
	public Uracan(String country, int date) {
		this.country = country;
		this.date = date;
		this.fuel = MAX_GAS;
		this.speed = 0;
	}

	@Override
	public void accel() {
		//한번 가속시 스피드 + 50
		if (speed + 50 > 300) {
			speed = 300;
			System.out.println("현재 최고 속도입니다");
		}else {
			speed += 50;
			System.out.println("속도가 50 증가했습니다");
		}
		fuel -= 5;
		System.out.println();
	}

	@Override
	public void breakSpeed() {
		if (speed - 30 < 0) {
			speed = 0;
		}else {
			speed -= 30;
			System.out.println("속도가 30 감소했습니다");
		}
		System.out.println();
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
		System.out.println();
	}

	@Override
	public void showStatus() {
		System.out.println("생산국: " + country);
		System.out.printf("연식: %d년식\n", date);
		System.out.println("현재 속도: " + speed);
		System.out.println("현재 연료량: " + fuel);
		System.out.println();
	}
}
