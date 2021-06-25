package interaction.game;

public class Warrior {
	private int hp;
	private int atk;
	private int sld;
	private int mp;
	private int lv;
	private int exp;
	
	public Warrior() {
		this.hp = 100;
		this.atk = 20;
		this.sld = 100;
		this.mp = 100;
		this.lv = 10;
		this.exp = 0;
	}
	
	public void wInfo() {
		System.out.println("lv: " + lv);
		System.out.println("hp: " + hp);
		System.out.println("mp: " + mp);
		System.out.println("shield : " + sld);
		System.out.println("exp: " + exp);
		System.out.println();
	}
	
	public void HuntNashor(Nashor1 nashor) {
		if (this.atk > nashor.getNhp()) {
			System.out.println("공격력이 낮아 흠집도 나지 않았습니다");
		}
		
	}
	public void HuntDragon() {
		
	}
	public void huntCrap() {
		
	}
	
	
	
}
