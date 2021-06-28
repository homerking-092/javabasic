package polymophism.game;

public class Monster {
	private int hp;
	private int atk;
	private String name;
	private int exp;

	public Monster(String name, int hp, int atk, int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.exp = exp;
	}
	
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	//유저의 공격력을 int형 데이터타입 파라미터로 받는 setter
	public void doBattle(int uAtk) {
		this.hp = this.hp - uAtk;
		if (this.hp <= 0) {
			this.hp = 0;
			System.out.println(name + "이 죽었습니다");
		}

	}
	
	public void showMonster() {
		if (getHp() <= 0) {
			System.out.println("<<" + getName() + "은 사망상태" + ">>");
		}
		System.out.println("monster name: " + name);
		System.out.println("hp: " + hp);
		System.out.println("atk: " + atk);
		System.out.println("경험치: " + exp);
	
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
