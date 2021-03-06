package inheritance.game;

public class Commoner {
	// 레벨, 체력, 아이디, 마나수치를 변수로 생성
	public int lv;
	public int hp;
	public String id;
	public int mp;
	public int ps;		// 물방
	public int as; 		// 마방
	public int value; 	// 스탯수치
	public int exp; 	//경험치
	// 메서드는 getInfo()로 콘솔에 변수 상태를 조회할 수 있도록 구성

	public void getInfo() {
		System.out.println("캐릭 생성");
		System.out.println("아이디: " + id);
		System.out.println("--스탯--");
		System.out.println("레벨: " + lv + ", 체력: " + hp + ", 마나: " + mp + ", 물방 : " + ps + ", 마방: " + as);
	}

	public void byAt() {
		value = 15;
		hp -= value;
		System.out.println();
		if (hp >= 20 && hp <= 100) {
			System.out.println("현재 체력: " + hp + "(" + -value + ")");
			System.out.println("체력이 " + value + "만큼 감소했습니다");
		} else if (hp < 20 && hp > 0) {
			System.out.println("현재 체력: " + hp + "(" + "-" + value + ")");
			System.out.println("!!!주의 체력이 부족합니다!!!");
			System.out.println("포션을 빨아주세요");
		} else {
			System.out.println("당신은 사망하였습니다");
		}
		System.out.println();

	}// end byAt()
	
	public void hunt() {
		System.out.println("사냥이 시작되었습니다");
		int cnt = 10;
		if (hp > 50) {	//hp가 50을 초과할때
			hp -= 20;	//hp가 20 까인다
		}else {			//hp가 50이하일때
			hp -= 10;	//hp는 10까이고
			cnt *= 2;	//exp는 10 더 받는다
		}
		System.out.println("받은 경험치: " + cnt);
		exp += cnt;
		System.out.println("현재 체력: " + hp);
		System.out.println("현재 경험치: " + exp);
		System.out.println();
	}
}// end class
