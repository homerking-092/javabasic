package accessmodifier.game;

public class Archer extends Commoner {
	private int sr;
	public Archer() {
		super(10, 250, 250, "김궁수", 0);
	}
	
	public void aInfo() {
		System.out.println(getId() + "의 스탯");
		System.out.println("레벨: " + getLv());
		System.out.println("hp: " + getHp());
		System.out.println("mp: " + getMp());
		System.out.println("경험치: " + getExp());
	}
	public void doubleShot() {
		setMp(getMp() - 20);
		setExp(getExp() + 10);
		System.out.println(getId() + "이(가) 더블 샷을 사용했습니다");
	}

}
