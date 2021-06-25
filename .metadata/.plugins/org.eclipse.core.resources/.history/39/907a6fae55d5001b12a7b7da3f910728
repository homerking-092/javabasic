package interaction.game;

public class Archer {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int lv;
	private int exp;
	
	public Archer(){
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.def = 1;
		this.lv = 1;
		this.exp = 0;
	}
	
	// 특정 몬스터인 오크를 공격하는 공격 메서드
	public void huntOrc(Orc orc) {
		// 공격 전에 먼저 오크의 체력을 체크해서 죽은 오크라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		if(orc.getHp() <= 0) {
			System.out.println("이미 죽은 오크를 공격할 수 없습니다.");
			return;
		}
		// 오크와 전투를 할 때는 자신의 공격력을 넘깁니다.
		orc.doBattle(this.atk);
		// 오크쪽 처리가 되고 나서 유저가 공격을 받았을 때
		// 유저가 죽는 상황이라면 역시 전투 메서드 종료
		if(orc.getAtk() > (this.hp + this.def)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		// 만약 전투 도중 오크가 죽었다면 경험치 20을 획득
		if(orc.getHp() <= 0) {
			System.out.println("경험치를 20 획득했습니다.");
			this.exp += 20;
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.def) - orc.getAtk();
		System.out.println("오크와의 교전 완료!");
		
	}
	// 특정 몬스터인 트롤을 공격하는 공격 메서드	
	public void huntTroll(Troll troll) {
		// 공격 전에 먼저 트롤의 체력을 체크해서 죽은 트롤이라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		if(troll.getHp() <= 0) {
			System.out.println("이미 죽은 트롤을 공격할 수 없습니다.");
			return;
		}
		// 트롤과 전투를 할 때는 자신의 공격력을 넘깁니다.
		troll.doBattle(this.atk);
		if(troll.getAtk() > (this.hp + this.def)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		// 만약 전투 도중 트롤이 죽었다면 경험치 25을 획득
		if(troll.getHp() <= 0) {
			System.out.println("경험치를 25 획득했습니다.");
			this.exp += 25;
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.def) - troll.getAtk();
		System.out.println("트롤과의 교전 완료!");
	}
	
	// 특정 몬스터인 드래곤을 공격하는 공격 메서드	
	public void huntDragon(Dragon dragon) {
		// 공격 전에 먼저 드래곤의 체력을 체크해서 죽은 트롤이라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		if(dragon.getHp() <= 0) {
			System.out.println("이미 죽은 드래곤을 공격할 수 없습니다.");
			return;
		}
		// 드래곤과 전투를 할 때는 자신의 공격력을 넘깁니다.
		dragon.doBattle(this.atk);
		if(dragon.getAtk() > (this.hp + this.def)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		// 만약 전투 도중 드래곤이 죽었다면 경험치 50을 획득
		if(dragon.getHp() <= 0) {
			System.out.println("경험치를 50 획득했습니다.");
			this.exp += 50;
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.def) - dragon.getAtk();
		System.out.println("드래곤과의 교전 완료!");
	}
	
	
	public void showStatus() {
		System.out.println("<<궁수의 상태입니다.>>");
		System.out.println("체력 : " + this.hp);
		System.out.println("마나 : " + this.mp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("레벨 : " + this.lv);
		System.out.println("경험치 : " + this.exp);
	}

}
