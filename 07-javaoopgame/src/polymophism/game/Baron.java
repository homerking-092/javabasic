package polymophism.game;

public class Baron extends Monster {
	private int mp;

	public Baron(String name, int hp, int atk) {
		super(name, hp, atk);
		this.mp = 10;
	}

	public void doBattle(int uAtk) {
//		super.doBattle(uAtk);
		setHp(getHp() - uAtk);
//		this.mp = this.mp - uAtk;
		if (this.getHp() <= 0) {
			setHp(0);
			System.out.println(getName() + "이 죽었습니다");
			this.mp += 5;
		}
	}
	
	public void showMonster() {
		super.showMonster();
		System.out.println("mp: " + this.mp);
		
	}

	public int getHp() {
		return super.getHp();
	}
	public void setHp(int hp) {
		super.setHp(hp);
		
	}

	public int getAtk() {
		return super.getAtk();
	}

	public String getName() {
		return super.getName();
	}

}
