package accessmodifier.game;

public class Magician extends Commoner {
	public Magician() {
		super(8, 150, 500, "김법사", 0);
	}
	
	public void mInfo() {
		System.out.println(getId() + "의 스탯");
		System.out.println("레벨: " + getLv());
		System.out.println("hp: " + getHp());
		System.out.println("mp: " + getMp());
		System.out.println("경험치: " + getExp());
		System.out.println();
	}
	public void fireBall() {
		setMp(getMp() - 100);
		setExp(getExp() + 10);
		System.out.println(getId() + "이(가) 파이어볼을(를) 사용했습니다");
		System.out.println("현재 경험치: " + getExp());
		System.out.println();
	}

}
