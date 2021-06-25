package inheritance.game;

public class Main3 {

	public static void main(String[] args) {
		// 신 직업군 2개를 여기에 생성해주세요.
		
		
		Magician m1 = new Magician();
		m1.hp = 65;
		m1.mp = 30;
		m1.level = 7;
		m1.mDam = 23;
		m1.id = "마법사임";
		m1.getInfo();
		
		Archer a1 = new Archer();
		a1.hp = 80;
		a1.mp = 15;
		a1.level = 6;
		a1.rDam = 20;
		a1.id = "궁수궁수";
		a1.getInfo();
	}

}
