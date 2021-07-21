package interaction.game;

public class Nashor1 {
	private int hp;
	private int atk;
	private int sld;
	
	public Nashor1() {
		this.hp = 30;
		this.atk = 30;
		this.sld = 30;
	}
	public int getNhp() {
		return hp;
	}
	
	public void NaInfo() {
		System.out.println("바론 스탯");
		System.out.println("hp: " + hp);
		System.out.println("akt: " + atk);
		System.out.println("sld: " + sld);
		System.out.println();
	}
	
	
	public void Atttack() {
		this.hp -= hp;
	}
	
	
	
	
}
