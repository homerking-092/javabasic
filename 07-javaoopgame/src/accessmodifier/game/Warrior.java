package accessmodifier.game;

public class Warrior extends Commoner {
	public Warrior() {
		super(10, 300, 200, "김전사", 0);
	}

	public void wInfo() {
//		setId("김전사");
//		setExp(0);
//		setHp(500);
//		setLv(10);
//		setMp(200);

		System.out.println(getId() + "의 스탯");
		System.out.println("레벨: " + getLv());
		System.out.println("hp: " + getHp());
		if (getMp() != 200) {
			this.getMp();
			System.out.println("마나: " + this.getMp());
		} else {
			System.out.println("mp: " + getMp());
		}
		
		//경험치
		if (getExp() > 0) {
			this.getExp();
			System.out.println("경험치: " + this.getExp());

		}else if (getExp() == 100) {
			lvUp();
			setExp(0);
			System.out.println("경험치: " + this.getExp());
		}
		else {
			System.out.println("경치: " + getExp());
		}
		System.out.println();

	}

	public void doubleAttack() {
		System.out.println(getId() + "이(가) 더블어택을 사용했습니다");
		setExp(getExp() + 10);
		setMp(getMp() - 2); 
//		mpDown(2);
		int mpd = -2;

		System.out.println(getId() + "의 mp가 " + mpd + " 만큼 감소했습니다");
		System.out.println("경험치: " +  getExp());
		System.out.println();
	}
}
