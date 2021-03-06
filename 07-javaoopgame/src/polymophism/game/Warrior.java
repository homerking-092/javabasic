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
		System.out.println(monster.getName() + "과의 교전이 시작되었습니다");
		// 공격 전에 먼저 몬스터의 체력을 체크해서 죽은 몬스터라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		if (monster.getHp() <= 0) {
			System.out.println("이미 죽은 " + monster.getName() + "을 공격할 수 없습니다.");
			System.out.println();
			System.out.println();
			return;
		}
//		if (monster.getHp() <= 0) {
//			System.out.println("이미 죽은 바론을 공격할 수 없습니다.");
//			System.out.println();
//			return;
//		}
		// 바론과 전투를 할 때는 자신의 공격력을 넘깁니다.
		monster.doBattle(this.atk);

		if (monster.getAtk() > this.hp) {
			System.out.println(id + "이(가) 사망했습니다.");
			System.out.println();
			return;
		}

		// 만약 전투 도중 바론이 죽었다면 경험치 50 획득
		if (monster.getHp() <= 0) {
			System.out.println("경험치를 50 획득했습니다.");
			this.exp += 50;
			System.out.println("바론과의 교전 완료");
			System.out.println();
			return;
		}
		// 만약 경험치가 만땅이 된다면 레벨업 ㄱㄱ
		if (getExp() >= getExp()) {
			this.exp = 0;
			lv += 1;
			System.out.println(id + "이(가)" + lv + "로 레벨업 했습니다");
			System.out.println();
			return;
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = this.hp - monster.getAtk();
		System.out.println("바론과의 교전 완료");
		System.out.println();
	}

	private int getExp() {
		return this.exp;
	}
}
