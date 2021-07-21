package interaction.game;

public class Magician {
	private int hp;
	private int atk;
	private int sld;
	private int mp;
	private int lv;
	private int exp;
	
	public Magician() {
		hp = 150;
		atk = 150;
		sld = 150;
		mp = 150;
		lv = 10;
		exp = 0;
	}
	
	public void HuntNashor(Nashor1 nashor) {
		hp -= 50;
		exp += 100;
		
	}
	public void HuntDragon() {
		
	}
	public void huntCrap() {
		
	}
}
