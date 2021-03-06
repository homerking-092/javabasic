package game;

public class Commoner {
	private int level; 	// 레벨
	private int hp; 	// hp
	private int mp; 	// mp
	private int sd; 	// 방어력
	private int myExp; 	// 현재경험치
	private int exp; 	// 받는 경험지
	private String id; 	// id

	public Commoner() {
		this.level = 1;
		this.hp = 100;
		this.mp = 100;
		this.sd = 10;
		this.myExp = 0;
		this.id = id;

	}

	public void getInfo() {
		System.out.println(id + " 이(가) 생성되었습니다!!");
		System.out.println("레벨: " + level);
		System.out.println("체력: " + hp);
		System.out.println("마나: " + mp);
		System.out.println("방어력: " + sd);
		System.out.println("경험치: " + myExp);
		System.out.println();
	}
	
	public void hunt() {
		exp = 10;
		System.out.println(id + " 이(가) 사냥 시작");
		if (hp >= 60) {
			hp -= 20;
		} else {
			hp -= 10;
			exp *= 2;
		}
		System.out.println("받은 경험치: " + exp);
		myExp += exp;
		System.out.println("현재 체력: " + hp);
		System.out.println("현재 경험치: " + myExp);
		System.out.println();
	}

}
