package interaction.game;

public class Warrior {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int lv;
	private int exp;
	private String id;

	public Warrior(String id) {
		this.id = id;
		this.hp = 100;
		this.mp = 100;
		this.atk = 10;
		this.def = 0;
		this.lv = 10;
		this.exp = 0;
	}

	// 특정 몬스터인 바위게를 사냥하는 공격 메서드
	public void huntCrap(Crap crap) {
		// 공격 전에 먼저 오크의 체력을 체크해서 죽은 바위게라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		if (crap.getHp() <= 0) {
			System.out.println("이미 죽은 바위게를 공격할 수 없습니다.");
			System.out.println();
			return;
		}
		// 바위게와 전투를 할 때는 자신의 공격력을 넘깁니다.
		crap.doBattle(this.atk);
		// 바위게쪽 처리가 되고 나서 유저가 공격을 받았을 때
		// 유저가 죽는 상황이라면 역시 전투 메서드 종료
		if (crap.getAtk() >= (this.hp + this.def)) {
			hp = 0;
			System.out.println("유저가 사망했습니다.");
			System.out.println();
			return;
		}
		// 만약 전투 도중 바위게가 죽었다면 경험치 20을 획득
		if (crap.getHp() <= 0) {
			System.out.println("경험치를 20 획득했습니다.");
			this.exp += 20;
			System.out.println();
		}
		if (getExp() >= 100) {
			this.exp -= 100;
			this.lv++;
			System.out.println(id + "이(가)" + getExp() + "로 레벨업했습니다");
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.def) - crap.getAtk();
		System.out.println("바위게와의 교전 완료!");
		System.out.println();

	}

	//

	// 특정 몬스터인 바론을 공격하는 공격 메서드
	public void huntNashor(Nashor nashor) {
		System.out.println("바론과의 교전이 시작되었습니다");
		// 공격 전에 먼저 트롤의 체력을 체크해서 죽은 트롤이라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		if (nashor.getHp() <= 0) {
			System.out.println("이미 죽은 바론을 공격할 수 없습니다.");
			System.out.println();
			return;
		}

		// 바론과 전투를 할 때는 자신의 공격력을 넘깁니다.
		nashor.doBattle(this.atk);
		// 바론쪽 처리가 되고 나서 유저가 공격을 받았을 때
		// 유저가 죽는 상황이라면 역시 전투 메서드 종료
		if (nashor.getAtk() > (this.hp + this.def)) {
			System.out.println(id + "이(가) 사망했습니다.");
			System.out.println();
			return;
		}
		// 만약 전투 도중 바론이 죽었다면 경험치 25를 획득
		if (nashor.getHp() <= 0) {
			System.out.println("경험치를 25 획득했습니다.");
			this.exp += 25;
			System.out.println("바론과의 교전 완료");
			System.out.println();
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
		this.hp = (this.hp + this.def) - nashor.getAtk();
		System.out.println("바론과의 교전 완료!");
		System.out.println();

	}

	// 특정 몬스터인 드래곤을 공격하는 공격 메서드
	public void huntDragon(Dragon dragon) {
		System.out.println(dragon.getName() + "과의 교전이 시작되었습니다");
		// 공격 전에 먼저 드래곤의 체력을 체크해서 죽은 드래곤이라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		if (dragon.getHp() <= 0) {
			System.out.println("이미 죽은 드래곤을 공격할 수 없습니다.");
			System.out.println();
			return;
		}
		// 드래곤과 전투를 할 때는 자신의 공격력을 넘깁니다.
		dragon.doBattle(this.atk);
		// 드래곤쪽 처리가 되고 나서 유저가 공격을 받았을 때
		// 유저가 죽는 상황이라면 역시 전투 메서드 종료
		if (dragon.getAtk() > (this.hp + this.def)) {
			System.out.println("유저가 사망했습니다.");
			System.out.println();
			return;
		}
		// 만약 전투 도중 드래곤이 죽었다면 경험치 60을 획득
		if (dragon.getHp() <= 0) {
			System.out.println("경험치를 60 획득했습니다.");
			System.out.println(dragon.getName() + "과의 교전 완료");
			System.out.println();
			this.exp += 60;
			System.out.println();
//			return;
		}
		// 만약 경험치가 100 이상이 된다면 레벨업 ㄱㄱ
		if (getExp() >= 100) {
			this.exp -= 100;
			lv += 1;
			System.out.println(id + "이(가)" + lv + "로 레벨업 했습니다");
			System.out.println();
			return;
		}

		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.def) - dragon.getAtk();
		System.out.println(dragon.getName() + "드래곤과의 교전 완료!");
		System.out.println();
	}

	public void wInfo() {
		System.out.println(id + "의 스텟");
		System.out.println("레벨 : " + this.lv);
		System.out.println("체력 : " + this.hp);
		System.out.println("마나 : " + this.mp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("경험치 : " + this.exp);
		System.out.println();
	}
	public int getExp() {
		return this.exp;
	}

//	public void lvUp() {
//		if (this.exp >= 100) {
//			this.exp = 0;
//			lv += 1;
//		}
//		System.out.println(id + "이(가)" + lv + "레벨로 업했습니다");
//	}

}
