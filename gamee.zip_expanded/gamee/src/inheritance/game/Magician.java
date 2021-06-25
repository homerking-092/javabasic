package inheritance.game;

public class Magician extends Commoner {
	public int mDam;
	
	public void getInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " + mp);
		System.out.println("마법 공격력 : " + mDam);
	}
}
