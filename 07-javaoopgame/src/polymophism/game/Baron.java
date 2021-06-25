package polymophism.game;

public class Baron extends Monster {
	private int mp;

	public Baron(String name, int hp, int atk) {
		super(name, hp, atk);
		this.mp = 10;
	}

	public void doBattle(int uAtk) {
		super.doBattle(uAtk);
		this.mp += 5;
	}
	
	public void showMonster() {
		super.showMonster();
		System.out.println("mp: " + this.mp);
		
	}

	public int getHp() {
		return super.getHp();
	}

	public int getAtk() {
		return super.getAtk();
	}

	public String getName() {
		return super.getName();
	}

}