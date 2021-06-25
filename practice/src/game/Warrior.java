package game;

public class Warrior extends Commoner {	//Commoner를 상속 받는다
	//private타입의 변수는 상속 안되네 
	private int level; 	// 레벨
	private int hp; 	// hp
	private int mp; 	// mp
	private int sd; 	// 방어력
	private int myExp; 	// 현재경험치
	private int exp; 	// 받는 경험지
	private String id; 	// id
	//공격력 추가
	private int atk;
	
	public Warrior(String id) {
		
		this.level = 10;
		this.hp = 300;
		this.mp = 200;
		this.sd = 10;
		this.myExp = 10;
		this.exp = 0;
		this.atk = 100;
		}
	public void wInfo() {
		System.out.println(id + " 이(가) 전사로 전직 성공");
		System.out.println("레벨: " + level);
		System.out.println("체력: " + hp);
		System.out.println("마나: " + mp);
		System.out.println("방어력: " + sd);
		System.out.println("경험치: " + myExp);
		System.out.println("공격력: " + atk);
		System.out.println();
	}
	public void atked() {
		if (hp < 150) {
			atk *= 2;
			hp -= 5;
		}else {
			hp -= 20;
		}
		
		System.out.println("체력이 150 밑으로 떨어져 공격력이 2배가 됩니다");
	}
	
}
