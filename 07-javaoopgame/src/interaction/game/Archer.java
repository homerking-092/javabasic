package interaction.game;

public class Archer {
	private int hp;
	private int atk;
	private int sld;
	private int mp;
	private int lv;
	private int exp;
	
	public Archer() {
		hp = 200;
		atk = 200;
		sld = 200;
		mp = 200;
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
