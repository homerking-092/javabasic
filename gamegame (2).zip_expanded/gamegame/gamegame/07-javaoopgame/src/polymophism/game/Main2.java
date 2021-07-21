package polymophism.game;

public class Main2 {
	public static void main(String[] args) {
		Magician m = new Magician("김법사", 100, 100);
		Monster b1 = new Baron("바론1", 30, 10, 50);
		m.showInfo();
		b1.showMonster();
		m.magicClaw(b1);
		m.showInfo();
		b1.showMonster();
		m.magicClaw(b1);
		m.showInfo();
		
		
	}
}
