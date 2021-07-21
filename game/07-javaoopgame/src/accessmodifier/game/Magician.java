package accessmodifier.game;

public class Magician extends Commoner {

	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		//hp = hp - 2;
		setHp(getHp()-4);
		setExp(getExp()+10);
	}
	
	public void fireball() {
		System.out.println("마법사가 화염구를 던집니다.");
		setMp(getMp()-3);
		setExp(getExp()+20);
	}
	
	public void cure() {
		System.out.println("마법사가 회복 주문을 외웁니다.");
		setHp(getHp()+10);
		setMp(getMp()-2);
	}
	
	public void getAllData() {
		System.out.println("체력:" + getHp());
		System.out.println("마나:" + getMp());
		System.out.println("레벨:" + getLevel());
		System.out.println("경험:" + getExp());
		System.out.println("--------------");
	}
}
