package polymophism.game;

public class Baron extends Monster {
	private int mp;

	// 바론 종류를 여러가지 주기위해 name, hp, atk을 파라미터로 넘긴
	public Baron(String name, int hp, int atk, int exp) {
		super(name, hp, atk, exp);
		this.mp = 10;
	}

	// 여긴 생성자부터 변수 초기화
//	public Baron() {
//		super("김바론", 10, 10);
//	}

	// 오버라이딩 됐기 때문에 가능
	public void doBattle(int uAtk) {
//		super.doBattle(uAtk);
		setHp(getHp() - uAtk);

		if (getHp() <= 0) {
//			this.hp = 0;
			setHp(0);
			System.out.println(getName() + "이 죽었습니다");
		}
		this.mp += 5;
	}

//	public void doBattle(int uAtk) {
//		setHp(getHp() - getAtk())
//		if (this.getHp() <= 0) {
//			setHp(0);
//			System.out.println(getName() + "이 죽었습니다");
//		}
//	}

	public void showMonster() {
		super.showMonster();
		System.out.println("mp: " + this.mp);
		System.out.println();
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

	public int getExp() {
		return super.getExp();
	}

	public void setExp(int exp) {
		super.getExp();
	}

}
