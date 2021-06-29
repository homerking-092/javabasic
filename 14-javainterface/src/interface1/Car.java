package interface1;

//인터페이스를 구현(상속이 아님!)하기 위해서는
//implements(extends 아님) 키워드를 사용한다
//인터페이스 내부의 추상메서드는 무조건 구현해줘야 한다
public class Car implements Vehicle {
	// 자동차라면 가져야 하는 변수 설정
	// 현재속도, 현재연료량, 차주
	private int speed;
	private int gas;
	private String name;

	// 차주만 입력받고 생성자를 만들어라
	// 나머지 요소는 현재 속도 0, 연료량 100을 자동 대입 ㄱㄱ
	public Car(String name) {
		this.gas = MAX_GAS;
		this.speed = 0;
		this.name = name;
	}

	@Override
	public void accel() {
		// 한 번 가속시 속도가 10씩 늘어나도록
		// 연료는 한 번 가속에 1씩 소비
		// 단 속도는 200을 초과할 수 없다

		// 가속전에 가속시 200을 초과하는 여부
		if (speed + 10 > 200) {
			speed = 200;
		} else {
			speed += 10;
		}
		// 가속 로직을 모두 점검한 후에 연료량 1 차감
		gas -= 1;
		System.out.println("속도가 10 올랐습니다");
		System.out.println();
	}

	@Override
	public void breakSpeed() {
		// 한 번 감속시 속도가 10씩 줄어들게 ㄱㄱ
		// 단 속도는 0 미만이 될 수 없다
		if (speed - 10 < 0) {
			speed = 0;
		} else {
			speed -= 10;
		}
		System.out.println("속도가 10 감소했습니다");
		System.out.println();

	}

	@Override
	public void reFuel() {
		//연료를 다시 채울 경우 30씩 채워준다
		//단, 연료 최대값은 상수 MAX_GAS를 이용해서 측정해라
		if (gas + 30 > MAX_GAS) {
			gas = MAX_GAS;
			System.out.println("기름 만땅상태");
		}else {
			gas += 30;
			System.out.println();
		}
	}

	@Override
	public void showStatus() {
		System.out.println("차주: " + name);
		System.out.println("현재 속도: " + speed);
		System.out.println("현재 연료량: " + gas);
		System.out.println();
	}

}
