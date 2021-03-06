package superClass;

//초음속 비행기는 비행기를 상속합니다
public class SuperSonicAirplane extends Airplane {
	// 초음속비행기도 일반 비행기처럼 속도를 사용한다
	// 따라서 변수는 추가로 정의하지 않는다

	public SuperSonicAirplane(int s) {
		// Airplane의 생성자는 상속되지 않는다
		// 따라서 부모쪽의 생성자라는 의미로
		// super();를 사용하여 이 떄 부모쪽에 넘겨줄 수치값도
		// 함께 받아서 처리한다
		super(s);
	}

	public void fly() {
		// 일반 비행(부모클래스의 fly)는 super.fly();를 이용해서 호출 가능
		// 속도 900 이하인 경우 일반 비행모드를 호출하고
		if (speed + 500 <= 900) {
			super.fly(); // super.fly();에서 super는 부모인 Airplane
		} else {
			// 속도가 900이상 1300이하인 경우는 초음속 비행을 호출하도록 로직 ㄱㄱ
			if (speed + 500 >= 1300) {
				speed = 1300;
				System.out.println("초음속모드");
			} else {
				speed += 500;
			}
			System.out.println("현재속도: " + speed + "km/h");
			System.out.println();

		}
	}

//	public void breakSpeed() {
//		if (speed - 100 < 0) {
//			speed = 0;
//		} else {
//			speed -= 100;
//			if (speed < 900) {
//				System.out.println("일반비행모드로 전환");
//			}
//		}
//		System.out.println("현재속도: " + speed);
//		System.out.println();
//	}
}// end class
