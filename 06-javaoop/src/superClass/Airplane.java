package superClass;

public class Airplane {
	// 비행기는 속도를 가진다
	public int speed;
//	public int value;

	// 생성자는 속도를 입력한 값으로 맞춰준다
	public Airplane(int s) {
		speed = s;
	}

	// fly()메서드를 수행하면 속도가 500씩 증가한다
//	public void fly() {
//		speed += 500;
//
//		// 속도를 조건식으로 체크해서
//		// 최대 속도는 900을 초과할 수 없고
//		// 최대속도 미만에서 500씩 더해주는 로직
//		if (speed <= 900 && speed > 0) {
//			System.out.println("시속" + speed + "km/h로 비행중");
//		} else {
//			speed = 900;
//			System.out.println("현재 시속" + speed + "km/h");
//			System.out.println("시속 900km/h를 초과하여\n속도를" + speed + "로 조정합니다");
//		}
//		System.out.println("-----------------");
//
//	}
	public void fly() {
		if (speed + 500 > 900) {
			speed = 900;
			System.out.println("시속 900km/h를 초과하여\n속도를" + speed + "로 조정합니다");
		}else {
			speed += 500;
		}
		System.out.println("시속" + speed + "km/h로 비행중");
		System.out.println();
	}

	// breakSpeed() 메서드를 수행하면 속도가 100씩 감소
	// 단, 브레이크 연산은 속도 최저선이 0이다
//	public void breakSpeed() {
//		speed -= 100;
//		// 속도를 조건식으로 체크해서
//		// 0미만으로 내려갈 수 없고 100씩 감소시키는 로직
//		if (speed <= 900 && speed >= 0) {
//			System.out.println("감속결과 시속 " + speed + "km/h 입니다");
//			System.out.println();
//		} else {
//			speed = 0;
//			System.out.println("현재 시속" + speed + "km/h");
//			System.out.println("뒤는 낭떠러지입니다");
//		}
//	}
	public void breakSpeed() {
		if (speed - 100 < 0) {
			speed = 0;
		}else {
			speed -= 100;
		}
		System.out.println("감속결과 시속 " + speed + "km/h 입니다");
		System.out.println();
	}

}//end class
