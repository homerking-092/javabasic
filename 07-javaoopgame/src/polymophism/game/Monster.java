package polymophism.game;

public abstract class Monster {
	private int hp;
	private int atk;
	private String name;

	public Monster(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}

	public abstract void doBattle(int uAtk); // {
//		this.hp = this.hp - uAtk;
//		if (this.hp <= 0) {
//			this.hp = 0;
//			System.out.println(name + "이 죽었습니다");
//		}

//	}

	public void showMonster() {
		System.out.println("name: " + name);
		System.out.println("hp: " + hp);
		System.out.println("atk: " + atk);
	}

	public int getAtk() {
		return atk;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

}
