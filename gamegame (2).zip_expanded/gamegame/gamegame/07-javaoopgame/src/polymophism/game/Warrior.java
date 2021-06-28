package polymophism.game;

public class Warrior {
	private int hp;
	private int atk;
	private int lv;
	private int exp;
	private String id;

	public Warrior(String id, int hp, int atk) {
		this.id = id;
		this.hp = hp;
		this.atk = atk;
		this.lv = 10;
		this.exp = 0;
	}

	public String getId() {
		return this.id;
	}

	public void showInfo() {
		System.out.println(getId() + "의 스텟");
		System.out.println("lv: " + lv);
		System.out.println("hp: " + hp);
		System.out.println("atk: " + atk);
		System.out.println("exp: " + exp);
		System.out.println();
	}

	public void huntMonster(Monster monster) {
		// 공격 전에 먼저 몬스터의 체력을 체크해서 죽은 몬스터라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		/// if문이의 조건식이 참이면 return 아래는 실행되지 ㄴㄴ
		if (monster.getHp() <= 0) {
			System.out.println("이미 죽은 " + monster.getName() + "을 공격할 수 없습니다.");
			System.out.println();
			return;
		} else if (monster.getHp() > 0) {
			System.out.println(monster.getName() + "과의 교전이 시작되었습니다");
			System.out.println();
//			return;
		}

		// 바론과 전투를 할 때는 유저의 공격력을 넘깁니다.
		monster.doBattle(this.atk); // setter doBattle
		// 전투 도중 유저가 사망
		if (monster.getAtk() > this.hp) {
			this.hp = 0;
			System.out.println(id + "이(가)" + monster.getName() + "의 공격으로 사망했습니다.");
			System.out.println("마을로 귀환합니다");
			System.out.println();
			return;
		}

		// 만약 전투 도중 바론이 죽었다면 경험치 50 획득
		if (monster.getHp() <= 0) {
			this.exp += monster.getExp();
//			this.exp += 50;
			System.out.println("경험치를 50 획득했습니다.");
//			System.out.println(monster.getName() + "과의 교전 완료");
			System.out.println();
//			return;
		}
		// 만약 경험치가 100이 된다면 레벨업 ㄱㄱ하고 체력 풀피
		if (this.exp >= 100) {
			this.exp -= 100;
			this.lv += 1;
//			this.hp = 100;
			System.out.println(this.id + "이(가)" + this.lv + "로 레벨업 했습니다");
			System.out.println(monster.getName() + "과의 교전 완료");
			System.out.println();
			return;
		}

		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = this.hp - monster.getAtk();
		System.out.println(monster.getName() + "과의 교전 완료");
		System.out.println();
		return;
	}

	public void doubleAttack(Monster monster) {
		System.out.println(id + "이(가)" + monster.getName() + "에게 더블어택을 사용했습니다");
		monster.setHp(monster.getHp() - 20);

		if (monster.getHp() <= 0) {
			System.out.println("이미 죽은 " + monster.getName() + "을 공격할 수 없습니다.");
			System.out.println();
			return;
		}

		// 몬스터와 전투를 할 때는 유저의 공격력을 넘깁니다.
//		monster.doBattle(this.atk); // setter doBattle
		// 전투 도중 유저가 사망
		if (monster.getAtk() > this.hp) {
			this.hp = 0;
			System.out.println(id + "이(가)" + monster.getName() + "의 공격으로 사망했습니다.");
			System.out.println("마을로 귀환합니다");
			System.out.println();
			return;
		}

		if (monster.getHp() <= 0) {
			this.exp += monster.getExp() + 1;
			System.out.println("더블어택 사용으로 " + monster.getName() + "를 처치");
			System.out.println("경험치 + 1");
		}
		System.out.println();
	}

	public int getHp() {
		return this.hp;
	}

	// public void setExp(int exp) {
	// if (this.exp >= 100) {
	// this.exp -= exp;
	// }
	// }

//	private int getExp() {
//		return this.exp;
//	}
}
